import java.util.Scanner;
class Score{
 Scanner sc = new Scanner(System.in);
 //열기준 0:국어 1:영어 2:수학 3:총점 4:평균 
 int score[][] = new int[3][5];
 String name[] = new String[3];
  Score()
  {   
   for(int i=0; i < score.length; i++)
   {
    System.out.print(i+1+"번학생이름:"); 
    name[i] = sc.next();
    System.out.print(i+1+"번학생국어:"); 
    score[i][0] = sc.nextInt();
    System.out.print(i+1+"번학생영어:");
    score[i][1] = sc.nextInt();   
    System.out.print(i+1+"번학생수학:");
    score[i][2] = sc.nextInt();
    score[i][3] = score[i][0]+score[i][1]+score[i][2];
    score[i][4] = score[i][3]/3;
   }
   for(int i=0; i < score.length; i++)
   {
    System.out.println(i+1+"번"+name[i]+""
      + "총점:"+score[i][3]+"/평균:"+score[i][4]);
   }
  }
}
public class Study0116a 
{
 public static void main(String[] args) {
  Score s = new Score();  
 }
}