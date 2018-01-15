import java.util.Scanner;
public class For_2tenplusplus 
{
	public static void main(String[] ar)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("출력할 단수입력");
		int dan = in.nextInt();
		
		
		for(int x = 1; x < 10; x++)
		{
			for(int y = 1; y < x; y++)
			{
				if(dan == x)
				{
					System.out.println(x + "*" + y + "=" + x*y);
					break;
				}
			}
		}
	
	}

}

