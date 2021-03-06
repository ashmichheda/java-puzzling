/*

	The program consists of 2 variable declarations & 2 print statements having conditional expressions.
	The 1st sysout, prints the result which is the value of x i.e. X
	The 2nd sysout, prints the result which is again the value of x i.e. X
	So the program should ideally print 'XX'.
	But the program prints 'X88' !
	
	Why is that so? The first print prints X and the second prints 88. Why such strange behaviour?
	
	Because, the operands used in the conditional expression are of different types
	one is INT, other is CHAR
	
	Thus in order to avoid the whole mess, 	the operands should be of the same type!
	Hence, solution is to convert variable i to char datatype.

*/



public class DosEquis {
    public static void main(String[] args) {
        char x = 'X';
        char i = 0;
        System.out.print(true  ? x : 0);
        System.out.print(false ? i : x); 
    }
}
