import java.util.Scanner;
public class IfControlTest_01 
{

	public static void main(String[] ar) 
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int firstsu = 0, secondsu = 0;
		
		
		System.out.print("첫번째 수 = ");
		firstsu = in.nextInt();
		System.out.print("두번째 수 = ");
		secondsu = in.nextInt();
		
		
		if(firstsu > secondsu)  
		{
			System.out.print("첫번째 수(" + firstsu + ")");
			System.out.print("가 두번째 수(" + secondsu + ")");
			System.out.println("보다 큰 수 입니다.");
		}	
	}
}
		