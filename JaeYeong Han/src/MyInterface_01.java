interface MyInterface_01
{
	void method_01();
	public abstract void method_02();
}
class ImplClass implements MyInterface_01
{
	public void method_01()

	{
		System.out.println("method_01 override!");
	
	}
	public void method_02()
	{
		System.out.println("method_02 override!");
	}
}
public class InterfaceTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplClass ic = new ImplClass();
		ic.method_01();
		ic.method_02();
	}

}


interface MyInterface
{
	int w = 10;
	static int x = 20;
	final int y = 30;
	public static final int z = 40;
}
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("w = " + MyInterface.w);
		System.out.println("x = " + MyInterface.x);
		System.out.println("y = " + MyInterface.y);
		System.out.println("z= " + MyInterface.z);
	}

}
