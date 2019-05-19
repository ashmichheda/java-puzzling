/*

By merely looking at the program, one might feel that we are adding two "INT" operands which should fetch 66666 as the answer!
But, the answer comes out to be 17777. This is because, one of the operand is 'INT' and the other is 'LONG'.
PRACTICE is to always use Capital letter 'L' while using long literals.


*/



public class Elementary {
    public static void main(String[] args) {
		
		// change small el 'l' literal to capital 'L'		
        System.out.println(12345 + 5432L);
    }
}
