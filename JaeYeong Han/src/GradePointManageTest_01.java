import java.util.Scanner;

public class GradePointManageTest_01 {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

 

		Scanner in = new Scanner(System.in);

		

		int[] subject = new int[4];

		float avg = 0.0f;

		

		

		do 

		{

			System.out.print("������� = ");

			subject[0] = in.nextInt();

			

		}

		while(subject[0] < 0 || subject[0] > 100);

		

		do 

		{

			System.out.print("������ = ");

			subject[1] = in.nextInt();

			

		}

		while(subject[1] < 0 || subject[1] > 100);

		

		do 

		{

			System.out.print("���о�� = ");

			subject[2] = in.nextInt();

			

		}

		while(subject[2] < 0 || subject[2] > 100);

		

		subject[3] = subject[0] + subject[1] + subject[2];

		avg = subject[3] / 3.0f;

		

		System.out.println();

		System.out.println("���� : " + subject[3] + "��");

		System.out.printf("��� : %.2f��", avg);

 

				

				

	}

 

}

