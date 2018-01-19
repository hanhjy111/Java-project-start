import java.util.Scanner;

class MyPoint

{

	protected static Scanner in;

	static 

	{

		in = new Scanner(System.in);

		

	}

	private int x;

	private int y;

	protected MyPoint()

	{

		System.out.print("점 x = ");

		this.x = in.nextInt();

		System.out.print("점 y = ");

		this.y = in.nextInt();

		

	}

	protected void display()

	{

		System.out.printf("점(x, y) = (%d, %d)\n", this.x, this.y);

		

	}

}

class Circle extends MyPoint

{

	private int r;

	public Circle()

	{

		System.out.print("반지름 r = ");

		this.r = in.nextInt();

		

	}

	public void display()

	{

		super.display();

		System.out.printf("반지름 r = %d\n", this.r);

		

	}

}

class Rect extends MyPoint

{

	private int w;

	private int h;

	public Rect()

	{

		System.out.print("폭 w = ");

		this.w = in.nextInt();

		System.out.print("높이 h =");

		this.h = in.nextInt();

	}

	public void display()

	{

		super.display();

		System.out.printf("폭 w : %d, 높이 h : %d\n", this.w, this.h);

		

	}

}

public class FigureTest 

{

 

	public static void main(String[] ar) 

	{

		// TODO Auto-generated method stub

 

		Circle circle = new Circle();

		circle.display();

		System.out.println();

		Rect rect = new Rect();

		rect.display();

	}

 

}



