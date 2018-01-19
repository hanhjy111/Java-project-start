class ConstructExam_01
{
	int age;
	double money;
	
	
	ConstructExam_01()
	{
		age = 30;
		money = 6800000.0;
	
	}
	ConstructExam_01(int x)
	{
		age = x;
		money = 6800000.0;
	}
	ConstructExam_01(double y)
	{
		age = 30;
		money = y;
	}
	ConstructExam_01(int x, double y)
	{
			age = x;
			money = y;
	}
}


public class ClassConstructExam_01 
{

	public static void main(String[] args) 
	{
	
		ConstructExam_01 first = new ConstructExam_01();
		ConstructExam_01 second = new ConstructExam_01(40);
		ConstructExam_01 third = new ConstructExam_01(5500000.0);
		ConstructExam_01 fourth = new ConstructExam_01(50, 73000000.0);
		
		System.out.println("first = "+first.age+","+first.money);
		System.out.println("second = "+second.age+","+second.money);
		System.out.println("third = "+third.age+","+third.money);
		System.out.println("fourth = "+fourth.age+","+fourth.money);System.out.println("first = "+fourth.age+","+third.money);
	}

}
