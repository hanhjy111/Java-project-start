// 입력

		

				//1번학생 이름:

				//1번학생 키:

				//1번학생 나이:

				

				//2번학생 이름:

				//2번학생 키:

				//2번학생 나이:

				

				//3번학생 이름:

				//3번학생 키:

				//3번학생 나이:

				

				// 1번 / 홍길동 / 177.8cm / 20살

				// ;

				// 3번 

		

		import java.util.Scanner;

 

		public class Study0109_2 {

 

		 public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);

		  String name[] = new String[3];

		  double height[] =  new double[3];

		  int age[] = new int[3];

		  

		  for(int i =0; i<3; i++)

		  {

		   System.out.print(i+1+"번학생 이름:");

		   name[i] = sc.next();

		   System.out.print(i+1+"번학생 키:");

		   height[i] = sc.nextDouble();

		   System.out.print(i+1+"번학생 나이:");

		   age[i] = sc.nextInt();

		  }

		  for(int i =0; i<3; i++)

		  {

		   System.out.println(i+1+"번 / "

		     + name[i]+" / "

		     + height[i]+"cm / "

		     + age[i]+"살");

		  }  

		  

		 }

 

		} 