/*

It looks like that the below program should print HaHa.
But it actually prints 	Ha169. Why would it do like that?

As expected, the first call to System.out.print prints Ha: It's argument is the "H" + "a" which performs the ususal String concatenation.
For the second call to System.out.print, it's argument in the expression is 'H' + 'a'.
The problem here is that 'H' and 'a' are char literals. Because neither of the operand is of type String,
the + operator perform addition instead of concatenation.

The compiler evaluates the expression 'H' + 'a' by promoting each of the char-ed valued operands to int values.

Thus, char value of H is 72 and a is 97. So 72 + 97 gives --> 169.


To avoid this, we can use libraries like StringBuilder

StringBuffer st = new StringBuffer();
sb.append('H');
sb.append('a');
System.out.println(sb);


To avoid the above, we can also force the + operator to perform concatenation rather than addition,
by ensuring atleast one of the operand is String.

System.out.print("" + 'H' + 'a');

This statement ensures that sub-expressions are converted to Strings.

*/




public class LastLaugh {
    public static void main(String args[]) {
        System.out.print("H" + "a");
        System.out.print('H' + 'a');
    }
}
