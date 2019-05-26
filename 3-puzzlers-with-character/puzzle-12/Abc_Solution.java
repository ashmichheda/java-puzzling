/*

The below program prints something like --> ABC easy as [C@15db9742
Although char is an integral type, many libraries treat it specially, because
char values usually represent characters rather than integers. For example, passing
a char value to println prints a Unicode character rather than its numerical
code.

Basically, it's returning the unsigned hexadecimal representation of the hashcode of the object.

There are two ways to fix it. You can explicitly convert the array to a string
before invoking string concatenation:

1)
System.out.println(letters + " easy as " + String.valueOf(numbers));

2) Alternatively, you can break the System.out.println invocation in two to
make use of the char[] overloading of println:
System.out.print(letters + " easy as ");
System.out.println(numbers);


Here, valueOf() takes parameter char [] array, and returns a string that contains the characters of that particular char []



*/



public class Abc {
    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
		
		// Here numbers does not get converted to String automatically. We need to explicitly convert char[] to String 
		// using the above solutions. Ohterwise it prints a vague number.
		
        System.out.println(letters + " easy as " + numbers);
    }
}
