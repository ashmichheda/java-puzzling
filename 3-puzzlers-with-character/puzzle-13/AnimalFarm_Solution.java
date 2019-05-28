/*

A superfical analysis of the program would make us think that the program should print Animals are equal: true
After all, pig and dog are both final String variables initialized to character sequence "length: 10".

The == operator however does not check the content of the 2 strings, it checks whether the 2 object references are identical,
which is false in this case. 

If you ran the program, you found that it prints false and
nothing else. It doesn’t print Animals are equal:

--> The solution to Puzzle 11
contains a hint: The + operator, whether used for addition or string concatenation,
binds more tightly than the == operator. Therefore, the parameter of the println
method is evaluated like this:
System.out.println(("Animals are equal: " + pig) == dog);

There is one surefire way to avoid this sort of difficulty:
--> When using the string concatenation operator, always parenthesize nontrivial
operands. More generally, when you are not sure whether you need parentheses, do include them. 
If you parenthesize the comparison in the println statement as follows, it will produce the expected output of Animals are equal: false:

System.out.println("Animals are equal: " + (pig == dog));

It is clear that the program prints true when it is fixed in this
fashion:
System.out.println("Animals are equal: " + pig.equals(dog));
*/



public class AnimalFarm {
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        System.out.println("Animals are equal: "+ pig == dog);
    }
}
