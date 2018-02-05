import java.util.Random;

public class RandomTest {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Random random = new Random();

		random.setSeed(System.currentTimeMillis());

		for(int i = 0; i < 5; ++i)

		{

			System.out.print(random.nextInt(10)+"\t");

		}

	}

 

}



class OtherThread extends Thread
{
	public OtherThread(String name)
	{
		super(name);
	}
	
	public void run()
	{ System.out.println("\n" + this.getName() + "-Start!!!");
	for(char ch = 'A'; ch <= 'Z'; ++ch)
	{
		try
		{
			Thread.sleep(350);
		}
		catch(InterruptedException e) {}
		System.out.printf("%c\t, ch");
		System.out.flush();
	}
	System.out.println("\n" + this.getName() + " - End!!!");
	}
}	
