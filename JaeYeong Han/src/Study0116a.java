import java.util.Scanner;
class Score{
 Scanner sc = new Scanner(System.in);
 //������ 0:���� 1:���� 2:���� 3:���� 4:��� 
 int score[][] = new int[3][5];
 String name[] = new String[3];
  Score()
  {   
   for(int i=0; i < score.length; i++)
   {
    System.out.print(i+1+"���л��̸�:"); 
    name[i] = sc.next();
    System.out.print(i+1+"���л�����:"); 
    score[i][0] = sc.nextInt();
    System.out.print(i+1+"���л�����:");
    score[i][1] = sc.nextInt();   
    System.out.print(i+1+"���л�����:");
    score[i][2] = sc.nextInt();
    score[i][3] = score[i][0]+score[i][1]+score[i][2];
    score[i][4] = score[i][3]/3;
   }
   for(int i=0; i < score.length; i++)
   {
    System.out.println(i+1+"��"+name[i]+""
      + "����:"+score[i][3]+"/���:"+score[i][4]);
   }
  }
}
public class Study0116a 
{
 public static void main(String[] args) {
  Score s = new Score();  
 }
}