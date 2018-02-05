import java.util.Scanner;
public class InputExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int x = 0, y = 0, tot = 0;
		
		boolean bool = false;
		
		do
		{
			bool = false;
			System.out.print("x = ");
			try
			{
				x = Integer.parseInt(in.nextLine());
				
			}
			catch(NumberFormatException ex)
			{
				System.out.println("x�� ���ڿ��� �մϴ�.");
				bool = true;
			}
		}
			while(bool);
		
		do
		{
			bool = false;
			System.out.print("y = ");
			try
			{
				y = Integer.parseInt(in.nextLine());
			}
			catch(NumberFormatException ex)
			{
				System.out.println("y�� ���ڿ��� �մϴ�.");
				bool = true;
			}
		}
		while(bool);
		
		try
		{
			tot = x / y;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("�������꿡�� 0 ���� ���� �� �����ϴ�.");
			tot = -1;
		}
		finally
		{
			System.out.printf("%d / %d = %d", x, y, tot);
		}
		
		in.close();
	}

}
