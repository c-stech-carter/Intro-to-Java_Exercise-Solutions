/*
This exercise can't be graded automatically on the Check Exercises App


Assignment instructions:
19.2 (Implement GenericStack using inheritance) In LiveExample 19.1,
GenericStack is implemented using composition. Define a new stack class
that extends ArrayList.
Draw the UML diagram for the classes then implement Generic Stack.
Write a test program that prompts the user to enter five strings and
displays them in reverse order.

UML Diagram:
+----------------------+
|   GenericStack<E>    |
|----------------------|
| +GenericStack()      |
| +getSize(): int      |
| +peek(): E           |
| +push(o: E): void    |
| +pop(): E            |
| +toString(): String  |
+----------------------+
^
|
Extends
|
+----------------------+
|    ArrayList<E>      |
+----------------------+


 */


import java.util.Scanner;

public class Exercise19_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            System.out.print("String " + (i + 1) + ": ");
            stack.push(scanner.nextLine());
        }

        System.out.println("\nStrings in reverse order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}

class GenericStack<E> extends java.util.ArrayList<E> {

    public GenericStack() {
        super();
    }

    public int getSize() {
        return size(); // size() is inherited from ArrayList
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return get(size() - 1); // Retrieve the top element
    }

    public void push(E o) {
        add(o); // Add element to the end (top of stack)
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return remove(size() - 1); // Remove and return the top element
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
