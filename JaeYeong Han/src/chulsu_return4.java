//  4.리턴값 0   전달값 0
//   - 철수야 10000원 줄테니 햄버거좀 사다줘
//   - 영희야 10000원 잘 받았어 새우버거 보낼게
//   - 철수야 새우버거 잘 받았어~!
public class chulsu_return4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	String buggerName = chulsu4(10000);
	System.out.println("철수야"+buggerName+"잘받았어~!");
	}  
	 static String chulsu4(int money)
	 {
	  System.out.println("철수야 "+money+"원 줄테니 햄버거좀 사다줘");
	  System.out.println("영희야 "+money+"원 잘 받았어 새우버거 보낼게");
	  
	  return "새우버거";
	 }
}
