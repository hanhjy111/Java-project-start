import java.util.Scanner;
public class GradepointmanageTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String[] subjectName = {"국어", "영어", "수학"};
		int[] subject = new int[subjectName.length + 1];
		float avg = 0.0f;
		
		
		do 
		{
			System.out.print(subjectName[0] + "점수 = ");
			subject[0] = in.nextInt();
			
		}
		while(subject[0] < 0 || subject[0] > 100);
		
		do 
		{
			System.out.print(subjectName[1] + "점수 = ");
			subject[1] = in.nextInt();
			
		}
		while(subject[1] < 0 || subject[1] > 100);
		
		do 
		{
			System.out.print(subjectName[2] + "점수 = ");
			subject[2] = in.nextInt();
			
		}
		while(subject[2] < 0 || subject[2] > 100);
		
		subject[subject.length - 1] = subject[0] + subject[1] + subject[2];
		avg = subject[subject.length - 1] / (float)subjectName.length;
		
		System.out.println();
		System.out.println("총점 : " + subject[subject.length - 1] + "점");
		System.out.printf("평균 : %.2f점", avg);

				
				
	}

}
