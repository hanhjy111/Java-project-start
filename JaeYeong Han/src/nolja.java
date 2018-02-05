import java.util.Scanner;
public class nolja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = 20;
		int b = 9;
		System.out.println(a == 10 ? "같다" : "다르다");
		System.out.println(b == 9 ? "같다" : "다르다");
		
		
		int x = 0;
		int y = 0;
		System.out.print(x == 10 ? "x의 값은 ="+ "10이다" : "y의 값은  ="+"10이 아니다 ");
		x = in.nextInt();
		System.out.print(y == 20 ? "y의 값은 = "+"20이다" : "y의 값은 ="+"20이 아니다");
		y = in.nextInt();
		
		// System.out.print x = in.nextInt(); 안에 3항연산자를 넣는 것은 쓰렉한 것 같다
		
		System.out.print("x의 값은 =");
		x = in.nextInt();
		if(x==10)
		{
			System.out.println("x의 값은 10이다");
		}
		else
		{
			System.out.println("x의 값은 10이 아니다");
		}
	}

}
