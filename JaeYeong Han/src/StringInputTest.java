import java.io.*;

public class StringInputTest 
{

	public static void main(String[] ar) throws IOException 
	{
		// TODO Auto-generated method stub

		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = in.readLine();
		System.out.println("����� �Է��Ͻ� �̸��� " + name + "�Դϴ�.");
		
		
		
	}

}
