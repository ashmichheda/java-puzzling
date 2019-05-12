/*
	The set of code worked only for positive integer values,
	and would always give "FALSE" for any non-positive value
	For e.g. if i == -3, would give remainder as -1 which is false

	Hence, to avoid this trap, better to add != 0 check for oddity as below!
*/




public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {
    }
}
