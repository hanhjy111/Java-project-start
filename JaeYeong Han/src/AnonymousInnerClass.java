class AnonymousInne

{

	private int u = 100;

	protected int v = 200;

	int w = 300;

	public static int x = 400;

	

	public void display()

	{

		

	}

	public static void display_01()

	{

		

	}

}

 

 

public class AnonymousInnerClass {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

 

		int y = 500;

		final int z = 600;

		

		AnonymousInne inner_01 = new AnonymousInne()

				{

			public t = 0;

			public void display()

			{

				System.out.prinln("t = " + t);

				System.out.prinln("u = " + u);

				System.out.prinln("v = " + v);

				System.out.prinln("w = " + w);

				System.out.prinln("x = " + x);

				System.out.prinln("y = " + y);

				System.out.prinln("z = " + z);

			}

			

				}

	}

 

}

 