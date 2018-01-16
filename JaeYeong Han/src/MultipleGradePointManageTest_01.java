import java.util.Scanner;
public class MultipleGradePointManageTest_01 

{
	public static void main(String[] args) 

	{
		Scanner in = new Scanner(System.in);

		String[] subjectName = {"국어", "영어", "수학"};
		int[][] subject = new int[3][5];
		float[] avg = new float[3];

				

		for(int m = 0; m < 3; ++m)
		{
			System.out.println(m + 1 +"번째 사람 점수 입력!!");
			for(int n = 0; n < 3; ++n)
			{
				do
				{
					System.out.print(subjectName[n] + "점수 =");
					subject[m][n] = in.nextInt();
				}
				while(subject[m][n] < 0 || subject[m][n] > 100);

				subject[m][3] += subject[m][n];
			}
			subject[m][4] = 1;
			avg[m] = subject[m][3] / (float)subjectName.length;
		}

		for(int m = 0; m <subject.length; m++)
		{
			for(int n = 0; n < subject.length; n++)
			{
				if(subject[m][subject[m].length - 2] < subject[n][subject[n].length - 2])
				{
					subject[m][subject[m].length - 1]++;
				}
			}
		}
			System.out.println();
			for(int m = 0; m < 3; ++m)
			{
				System.out.println(m + 1 + "번째 사람 점수!");
				System.out.println("석차 : "+subject[m][subject[m].length - 1] +"등");
				System.out.println("총점 : " + subject[m][subject[m].length - 1] + "점");

				System.out.printf("평균 : %2f점\n", avg[m]);			
			}

			in.close();

	}

			

 

		

		

}

 