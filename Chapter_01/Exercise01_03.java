/*
Solution for Exercise 1-2 from Intro to Java 13th Edition

*1.3 (Display a pattern) Write a program that displays the following pattern:

    J     A     V     V    A     
    J    A A     V   V    A A    
J   J   AAAAA     V V    AAAAA   
 J J   A     A     V    A     A
 
*/

public class Exercise01_03 {
    public static void main(String[] args) {
        System.out.print("    J     A     V     V    A     \n" +
                         "    J    A A     V   V    A A    \n" +
                         "J   J   AAAAA     V V    AAAAA   \n" +
                         " J J   A     A     V    A     A  \n");
    }
}

/*
Alternatively, switch with multiple println statements:

System.out.println("    J     A     V     V    A     ");
System.out.println("    J    A A     V   V    A A    ");
System.out.println("J   J   AAAAA     V V    AAAAA   ");
System.out.println(" J J   A     A     V    A     A  ");

*/
