/*  This exercise can't be graded automatically by the Check Exercises app, but this can
give you an idea of how to solve it.

Assignment:
19.1 (Revising LiveExample 19.1) Revise the  class in LiveExample 19.1 to implement it using an array rather than an ArrayList. 
You should check the array size before adding a new element to the stack. If the array is full, create a new array that doubles
the current array size and copy the elements from the current array to the new array. 
*/

public class Exercise19_01<E> {  //Listing GenericStack revised
    private E[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public Exercise19_01() {
        elements = (E[]) new Object[INITIAL_CAPACITY]; // Generic array creation workaround
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public void push(E o) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        E o = elements[--size];
        elements[size] = null; // Prevent memory leak
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("stack: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        E[] newElements = (E[]) new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }
}
