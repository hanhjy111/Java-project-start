// �Է�

		

				//1���л� �̸�:

				//1���л� Ű:

				//1���л� ����:

				

				//2���л� �̸�:

				//2���л� Ű:

				//2���л� ����:

				

				//3���л� �̸�:

				//3���л� Ű:

				//3���л� ����:

				

				// 1�� / ȫ�浿 / 177.8cm / 20��

				// ;

				// 3�� 

		

		import java.util.Scanner;

 

		public class Study0109_2 {

 

		 public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);

		  String name[] = new String[3];

		  double height[] =  new double[3];

		  int age[] = new int[3];

		  

		  for(int i =0; i<3; i++)

		  {

		   System.out.print(i+1+"���л� �̸�:");

		   name[i] = sc.next();

		   System.out.print(i+1+"���л� Ű:");

		   height[i] = sc.nextDouble();

		   System.out.print(i+1+"���л� ����:");

		   age[i] = sc.nextInt();

		  }

		  for(int i =0; i<3; i++)

		  {

		   System.out.println(i+1+"�� / "

		     + name[i]+" / "

		     + height[i]+"cm / "

		     + age[i]+"��");

		  }  

		  

		 }

 

		} 