
import java.util.Scanner;



class Score

{

	

	protected static Scanner in;

	static

	{

		in = new Scanner(System.in);

		

	}

	private int ����;

	private int ����;

	private int ����;

	private int ����;

	private int ���;

	protected Score()

	{

		System.out.print("���� : ");

		this.����= in.nextInt();

		System.out.print("���� : ");

		this.����= in.nextInt();

		System.out.print("���� : ");

		this.����= in.nextInt();

		

		

	}

	protected void display()

	{

		

		���� = ����+����+����;

		��� = ���� / 3;

		System.out.println("���� :" + ���� + "/��� : " + ���);

		

	}

}

class ABan extends Score

{

	private int ��ȸ;

	private int ����;

	public ABan()

	{

		System.out.print("��ȸ : ");

		this.��ȸ= in.nextInt();

		System.out.print("���� : ");

		this.����= in.nextInt();

	}

	public void display()

	{

		System.out.println();

		super.display();

	}

}

 

class BBan extends Score

{

	private int ����;

	private int �̼�;

	public BBan()

	{

		System.out.print("���� : ");

		this.����= in.nextInt();

		System.out.print("�̼� : ");

		this.�̼�= in.nextInt();

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

