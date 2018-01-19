import java.awt.Frame;
import java.util.Scanner;

class Score2{
 Scanner sc = new Scanner(System.in);
 int kor;//국어
 int eng;//영어
 int mat;//수학
 Score2()
 {
  System.out.print("국어:");
  kor = sc.nextInt();
  System.out.print("영어:");
  eng = sc.nextInt();
  System.out.print("수학:");
  mat = sc.nextInt();
 }
}

class ABan extends Score2{
 Scanner sc = new Scanner(System.in);
 int soc;//사회
 int sie;//과학
 int tot, avg;
 ABan()
 {
  System.out.print("사회:");
  soc = sc.nextInt();
  System.out.print("과학:");
  sie = sc.nextInt();
  tot = kor+eng+mat+soc+sie;
  avg = tot/5;
  System.out.println("총점:"+tot+"/평균:"+avg);
 }

}
class BBan extends Score2{
 Scanner sc = new Scanner(System.in);
 int mus;//음악
 int art;//미술
 int tot, avg;
 BBan()
 {
  System.out.print("음악:");
  mus = sc.nextInt();
  System.out.print("미술:");
  art = sc.nextInt();
  tot = kor+eng+mat+mus+art;
  avg = tot/5;
  
  System.out.println("총점:"+tot+"/평균:"+avg);
 }
 
}


public class Study0118 {

 public static void main(String[] args) {
  ABan a = new ABan();
  BBan b = new BBan();
  
 }
}

 