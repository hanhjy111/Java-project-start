
import java.util.Scanner;



class Score

{

	

	protected static Scanner in;

	static

	{

		in = new Scanner(System.in);

		

	}

	private int 국어;

	private int 영어;

	private int 수학;

	private int 총점;

	private int 평균;

	protected Score()

	{

		System.out.print("국어 : ");

		this.국어= in.nextInt();

		System.out.print("영어 : ");

		this.영어= in.nextInt();

		System.out.print("수학 : ");

		this.수학= in.nextInt();

		

		

	}

	protected void display()

	{

		

		총점 = 국어+영어+수학;

		평균 = 총점 / 3;

		System.out.println("총점 :" + 총점 + "/평균 : " + 평균);

		

	}

}

class ABan extends Score

{

	private int 사회;

	private int 과학;

	public ABan()

	{

		System.out.print("사회 : ");

		this.사회= in.nextInt();

		System.out.print("과학 : ");

		this.과학= in.nextInt();

	}

	public void display()

	{

		System.out.println();

		super.display();

	}

}

 

class BBan extends Score

{

	private int 음악;

	private int 미술;

	public BBan()

	{

		System.out.print("음악 : ");

		this.음악= in.nextInt();

		System.out.print("미술 : ");

		this.미술= in.nextInt();

	}

	public void display()

	{

		System.out.println();

		super.display();

	}

}

 

public class Study0118why 

{

 

	public static void main(String[] args) 

	{

		// TODO Auto-generated method stub

 

		

		ABan A = new ABan();

		A.display();

		BBan B = new BBan();

		B.display();

		

	}

 

}

