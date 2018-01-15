public class ComplexConsoleInputTest 
{

 

	public static void main(String[] ar)  throws java.io.IOException  
	{

		// TODO Auto-generated method stub

			System.out.print("입력1 = ");

			char input_01 = (char)System.in.read();

			System.out.print("입력2 = ");

			int input_02 = System.in.read() - 48;

			System.out.println( "입력된 문자는 " + input_01 +  "입니다.");

			System.out.println( "입력된 문자는 " + input_02 +  "입니다.");

			

	}

 

}