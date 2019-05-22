/*

Consider the following word problem: Tom goes to the auto parts store to buy a spark plug that costs $1.10, but all he
has in his wallet are two-dollar bills. How much change should he get if he pays
for the spark plug with a two-dollar bill?

Change.solution is the program that attempts to solve the problem. What does it print?

If we subtract the 2 numbers, the output would be 0.9
But the program prints 0.8999999999999999.

The problem here is that 1.1 can't be represented exactly as double, so it's represented by its closest double value.
Hence one should avoid using float or double in monetary calculations & INSTEAD use int or long or BigDecimal as data types.

*/



import java.Math.BigDecimal;
public class Change {
    public static void main(String args[]) {
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
    }
}
