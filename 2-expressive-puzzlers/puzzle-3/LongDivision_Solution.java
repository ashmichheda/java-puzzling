/*

The program gives the output as 5. Why does this happen?
The problem is that the computation of the constant MICROS_PER_DAY does the overflow.
Although the result of the computation fits in a long but it doesn't fit for an int.
The computation (i.e. 24 * 60 * 60 * 1000 * 1000) is performed entirely in an int arithmethic and only 
after the computation is completed the result is stored in long, but by then it's too late.
The computation has already overflowed returning a value that is too low by a factor of 200

But why is the computation performed in an int arithmetic? Because all the factors that are multiplied together are int values.
Java does not support target typing i.e. a language feature wherein which the type of a variable in which result is to be stored influences the computation.

SOLUITON: 
USE a long literal in place of an int as the first factor in each product.

Good practice is to do in both the products. Thus, the program won't overflow & prints 1000 as expected.

*/

public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
