import java.util.Scanner;
public class SwitchControlTest_2 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int su1 = 0, su2 = 0, result = 0;
		
		char yon = '\0';
		
		System.out.print("ù��° �� = ");
		su1 = in.nextInt();
		
		System.out.print("������(+, -, *, /, %) = ");
		yon = in.next().charAt(0);
		
		System.out.print("�ι�° �� = ");
		su2 = in.nextInt();

		
		 switch(yon)  {
		 case '+' : result = su1 + su2; break;
		 case '-' : result = su1 - su2; break;
		 case '*' : result = su1 * su2; break;
		 case '/' : result = su1 / su2; break;
		 case '%' : result = su1 % su2; break;
		 default :
			 System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�. : " + yon);
			 System.exit(0);
		 
		 }
		 
		 System.out.println();
		 System.out.println(su1 + " " + yon + " " + su2 + " = " + result);
		 
		
	}

}