
public class Study0109_method 
{
 public static void main(String[] args) 
 {
 //  1.리턴값 X   전달값 X
//  - 철수야 나가서 놀아라~!
  //chulsu1();  
//  2.리턴값 0   전달값 X
//   - 철수야 들어올때 커피2잔만 사다줘
//   - 응 2잔 잘 받았어~!
  //System.out.println("응"+chulsu2()+"잔 잘 받았어~!");
//  3.리턴값 X   전달값 0
//   - 철수야! 케익 줄테니 잘 받아~!
//   - 영희야~ 케익 잘 받았어!.
//  chulsu3("케익");
//  4.리턴값 0   전달값 0
//   - 철수야 10000원 줄테니 햄버거좀 사다줘
//   - 영희야 10000원 잘 받았어 새우버거 보낼게
//   - 철수야 새우버거 잘 받았어~!
   String buggerName = chulsu4(10000);
   System.out.println("철수야"+buggerName+"잘받았어~!");
 } 
 static String chulsu4(int money)
 {
  System.out.println("철수야 "+money+"원 줄테니 햄버거좀 사다줘");
  System.out.println("영희야 "+money+"원 잘 받았어 새우버거 보낼게");
  
  return "새우버거";
 }
 static void chulsu1()
 {
  System.out.println("철수야 나가서 놀아라~!");
 }
 static int chulsu2()
 {
  System.out.println("철수야 들어올때 커피2잔만 사다줘");
  return 2;
 }
 static void chulsu3(String bread)
 {
  System.out.println("철수야! 케익 줄테니 잘 받아~!");
  System.out.println("영희야~ "+bread +" 잘 받았어!");
  
 }

} 

 

public class chulsu1 

{

	 public static void main(String[] args)

	 {

	 

		 //  1.리턴값 X   전달값 X

		//  - 철수야 나가서 놀아라~!

		  //chulsu1(); 

	 }

		 static void chulsu1()

		 {

			 System.out.println("철수야 나가서 놀아라~!");

		 }

	 

}



public class chulsu2
{
 public static void main(String[] args) 
 {

	 System.out.println("응" + chulsu2()+ "잔 잘 받았어");
 }
	 static int chulsu2()
	 {
		 System.out.println("철수야 들어올때 커피2잔만 사다줘");
		 return 2;
	 }
	

 }	 
	 
	 
	 
	 


public class chulsu3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
		 static void chulsu3(String bread)
		 {
		  System.out.println("철수야! 케익 줄테니 잘 받아~!");
		  System.out.println("영희야~ "+bread +" 잘 받았어!");
		  
		 }

	


}

 