import java.util.Scanner;
public class nolja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = 20;
		int b = 9;
		System.out.println(a == 10 ? "����" : "�ٸ���");
		System.out.println(b == 9 ? "����" : "�ٸ���");
		
		
		int x = 0;
		int y = 0;
		System.out.print(x == 10 ? "x�� ���� ="+ "10�̴�" : "y�� ����  ="+"10�� �ƴϴ� ");
		x = in.nextInt();
		System.out.print(y == 20 ? "y�� ���� = "+"20�̴�" : "y�� ���� ="+"20�� �ƴϴ�");
		y = in.nextInt();
		
		// System.out.print x = in.nextInt(); �ȿ� 3�׿����ڸ� �ִ� ���� ������ �� ����
		
		System.out.print("x�� ���� =");
		x = in.nextInt();
		if(x==10)
		{
			System.out.println("x�� ���� 10�̴�");
		}
		else
		{
			System.out.println("x�� ���� 10�� �ƴϴ�");
		}
	}

}
