import java.io.*;

public class StringInputTest 
{

	public static void main(String[] ar) throws IOException 
	{
		// TODO Auto-generated method stub

		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		System.out.print("이름을 입력하세요 : ");
		name = in.readLine();
		System.out.println("당신이 입력하신 이름은 " + name + "입니다.");
		
		
		
	}

}
