import java.util.Scanner;

public class GradePointManageTest {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

 

		Scanner in = new Scanner(System.in);

		

		int kor = 0, eng = 0, math = 0,  total = 0;

		float avg = 0.0f;

		

		

		do 

		{

			System.out.print("������� = ");

			kor = in.nextInt();

			

		}

		while(kor < 0 || kor > 100);

		

		do 

		{

			System.out.print("������ = ");

			eng = in.nextInt();

			

		}

		while(eng < 0 || eng > 100);

		

		do 

		{

			System.out.print("���о�� = ");

			math = in.nextInt();

			

		}

		while(math < 0 || math > 100);

		

		total = kor + eng + math;

		avg = total / 3.0f;

		

		System.out.println();

		System.out.println("���� : " + total + "��");

		System.out.printf("��� : %.2f��", avg);

 

		

		

	}

 

}