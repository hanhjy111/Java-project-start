import java.util.Scanner;
public class ScannerInputTest {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("�̸� = ");
		String name = in.nextLine();
		System.out.print("���� = ");
		int age = in.nextInt();
		System.out.print("������ = ");
		Float weight = in.nextFloat();
		
		System.out.println();
		System.out.println(name + "��!");
		System.out.println("����� " + age + "�� �̽ð�, ");
		System.out.println("�����Դ� " + weight + "kg �Դϴ�.");
		
	}

}
