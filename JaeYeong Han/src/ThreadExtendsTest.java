public class ThreadExtendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Thread Start!!!");
		
		OtherThread otherThread = new OtherThread("Alphabet Thread!");
		otherThread.start();
		
		for(int n = 1; n <= 100; ++n)
		{
			try
			{
				Thread.sleep(100);
			}
		catch(InterruptedException e) {}
			System.out.print(n +"\t");
			System.out.flush();
			if(n % 7 == 0) System.out.println();
			
		}
		
		System.out.println("\nMain Thread End!!!");
	}

}