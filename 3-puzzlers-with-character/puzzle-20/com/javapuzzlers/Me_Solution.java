package com.javapuzzlers;


/*
The program appears to obtain is class Name ("com.javapuzzlers.Me_Solution"),
replace all occurrences of "." with "/" and append the string with ".class"
So it would print something like: com/javapuzzlers/Me_Solution.class

BUT, If you ran the program, it prints ///////////////////.class
What's going on? 

The problem is that, String.replaceAll takes the first argument as a regular expression (regex)
So, the regular expression "." matches any character and replaces it with "/"

In order to match the only period character, the period in the regex must be preceeded it with a backslash (\)
Because, the backslash character has a special meaning in a string literal, it must itself be escaped with a backslash!

Me_Solution.class.getName().replaceAll("\\.", "/") + ".class");
Thus, now the following program should print: com/javapuzzlers/Me_Solution.class




*/
public class Me_Solution {
   public static void main(String[] args) {
      System.out.println(
         Me_Solution.class.getName().replaceAll(".", "/") + ".class");
   }
}
