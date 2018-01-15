import java.util.Scanner;
public class SwitchControlTest_2 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int su1 = 0, su2 = 0, result = 0;
		
		char yon = '\0';
		
		System.out.print("첫번째 수 = ");
		su1 = in.nextInt();
		
		System.out.print("연산자(+, -, *, /, %) = ");
		yon = in.next().charAt(0);
		
		System.out.print("두번째 수 = ");
		su2 = in.nextInt();

		
		 switch(yon)  {
		 case '+' : result = su1 + su2; break;
		 case '-' : result = su1 - su2; break;
		 case '*' : result = su1 * su2; break;
		 case '/' : result = su1 / su2; break;
		 case '%' : result = su1 % su2; break;
		 default :
			 System.out.println("연산자를 잘못 입력하였습니다. : " + yon);
			 System.exit(0);
		 
		 }
		 
		 System.out.println();
		 System.out.println(su1 + " " + yon + " " + su2 + " = " + result);
		 
		
	}

}