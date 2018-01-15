import java.util.Scanner;
public class IfControlTest_02 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		

		int firstsu = 0, secondsu = 0, thirdsu = 0;
		int imsi = 0;
		
		System.out.print("첫번째 수 = ");
		firstsu = in.nextInt();
		
		System.out.print("두번째 수 = ");
		secondsu = in.nextInt();
		
		System.out.print("세번째 수 = ");
		thirdsu = in.nextInt();
		
		if(secondsu >= firstsu && secondsu >=thirdsu)   {
			imsi = firstsu;
			firstsu = secondsu;
			secondsu = imsi;
			
		}
		else if(thirdsu >= firstsu && thirdsu >=secondsu)   {
			imsi = firstsu;
			firstsu = thirdsu;
			thirdsu = imsi;
	
	   }
		
		if(thirdsu >= secondsu)   {
			imsi = secondsu;
			secondsu = thirdsu;
			thirdsu = imsi;
		}
		
		System.out.println();
		System.out.println(firstsu + " >= " + secondsu + " >= " + thirdsu);
		
		
		
		in.close();
		
		
	}
		
		
}