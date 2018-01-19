import java.util.Scanner;

public class Study0116 
{
 public static void main(String[] args) {
  Score s = new Score();  
 }

}
class Score{
 Scanner sc = new Scanner(System.in);
  int kor;//국어
  int eng;//영어
  int mat;//수학
  int tot,avg;//총점,평균
  
  //생성자
  Score()
  {    
   System.out.print("국어:"); 
   kor = sc.nextInt();
   System.out.print("영어:");
   eng = sc.nextInt();   
   System.out.print("수학:");
   mat = sc.nextInt();
   tot = kor+eng+mat;
   avg = tot/3;
   System.out.println("총점:"+tot+"/평균:"+avg);
  }

}