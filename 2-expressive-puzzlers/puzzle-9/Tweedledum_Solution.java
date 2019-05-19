/*

Most of us think that the first statement x+=i is simply a shorthand of the second x = x+i
However, this isn't true. Both of these statements are assignment expressions. The 2nd statement uses a simple assignment operator (=)
whereas the first uses compound assignment operator (+=)

** The Java Language Specification says that compound assignment expressions automatically cast the result of the computation
they perform to the type of the variable on their left-hand side!

So, if the type of the result is wider than the variable then the compound assignment operator performs a slight narrowing primitive conversion

For e.g.
short x = 0;
int i = 123456;

x += i; // Contains a hidden cast!

You might expect the value of x to be 123456, but it's -7616. The int value 123456 is too big to fit in a short type. 
Thus the hidden cast silently lops off the two high-order bytes of the int value!
*/



public class Tweedledum {
    public static void main(String[] args) {
        // Put your declarations for x and i here

        x += i;     // Must be LEGAL
        x = x + i;  // Must be ILLEGAL
    }
}
