import java.awt.Frame;
import java.util.Scanner;
class Calc{ 
 Scanner sc = new Scanner(System.in);
 int su1;
 int su2;
 int yon;
 int result;
 Calc()
 {
  System.out.print("첫번째수:");
  su1 = sc.nextInt();
  System.out.print("두번째수:");
  su2 = sc.nextInt();
  System.out.print("연산자(1.+ 2.- 3.x 4./):");
  yon = sc.nextInt();
  if(yon == 1){result=su1+su2;}
  else if(yon == 2){result=su1-su2;}
  else if(yon == 3){result=su1*su2;}
  else if(yon == 4){result=su1/su2;}
  System.out.println("결과:"+ result);
  
 }
}
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


public class Study0118a {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int select;
  while(true)
  {
   System.out.println("1.계산기");
   System.out.println("2.A반점수처리");
   System.out.println("3.B반점수처리");
   System.out.println("4.종료");
   System.out.print("선택:");
   select = sc.nextInt();
   if(select == 1){Calc c = new Calc();}
   else if(select==2){ABan a = new ABan();}
   else if(select == 3){BBan b = new BBan();}
   else if(select == 4){break;}
  }
  
  
  
 }
}

 