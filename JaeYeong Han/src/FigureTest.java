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

		System.out.print("�� x = ");

		this.x = in.nextInt();

		System.out.print("�� y = ");

		this.y = in.nextInt();

		

	}

	protected void display()

	{

		System.out.printf("��(x, y) = (%d, %d)\n", this.x, this.y);

		

	}

}

class Circle extends MyPoint

{

	private int r;

	public Circle()

	{

		System.out.print("������ r = ");

		this.r = in.nextInt();

		

	}

	public void display()

	{

		super.display();

		System.out.printf("������ r = %d\n", this.r);

		

	}

}

class Rect extends MyPoint

{

	private int w;

	private int h;

	public Rect()

	{

		System.out.print("�� w = ");

		this.w = in.nextInt();

		System.out.print("���� h =");

		this.h = in.nextInt();

	}

	public void display()

	{

		super.display();

		System.out.printf("�� w : %d, ���� h : %d\n", this.w, this.h);

		

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



