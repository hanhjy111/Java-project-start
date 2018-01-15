import java.util.Scanner;
public class GradepointmanageTest_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String[] subjectName = {"국어", "영어", "수학"};
		int[] subject = new int[subjectName.length + 1];
		float avg = 0.0f;
		
		
		for(int n = 0; n < subjectName.length; ++n)
		{
			do 
			{
				System.out.print(subjectName[n] + "점수 = ");
				subject[n] = in.nextInt();
			
			}
			while(subject[n] < 0 || subject[n] > 100);
			
			subject[subject.length - 1] += subject[n];
		}
		
	
		avg = subject[subject.length - 1] / (float)subjectName.length;
		
		System.out.println();
		System.out.println("총점 : " + subject[subject.length - 1] + "점");
		System.out.printf("평균 : %.2f점", avg);

				
				
	}

}


