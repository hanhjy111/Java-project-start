import java.util.Scanner;
public class IfControlTest_01 
{

	public static void main(String[] ar) 
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int firstsu = 0, secondsu = 0;
		
		
		System.out.print("ù��° �� = ");
		firstsu = in.nextInt();
		System.out.print("�ι�° �� = ");
		secondsu = in.nextInt();
		
		
		if(firstsu > secondsu)  
		{
			System.out.print("ù��° ��(" + firstsu + ")");
			System.out.print("�� �ι�° ��(" + secondsu + ")");
			System.out.println("���� ū �� �Դϴ�.");
		}	
	}
}
		