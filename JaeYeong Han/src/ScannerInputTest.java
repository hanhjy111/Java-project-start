import java.util.Scanner;
public class ScannerInputTest {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("이름 = ");
		String name = in.nextLine();
		System.out.print("나이 = ");
		int age = in.nextInt();
		System.out.print("몸무게 = ");
		Float weight = in.nextFloat();
		
		System.out.println();
		System.out.println(name + "님!");
		System.out.println("당신은 " + age + "세 이시고, ");
		System.out.println("몸무게는 " + weight + "kg 입니다.");
		
	}

}
