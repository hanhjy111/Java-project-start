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
  System.out.print("ù��°��:");
  su1 = sc.nextInt();
  System.out.print("�ι�°��:");
  su2 = sc.nextInt();
  System.out.print("������(1.+ 2.- 3.x 4./):");
  yon = sc.nextInt();
  if(yon == 1){result=su1+su2;}
  else if(yon == 2){result=su1-su2;}
  else if(yon == 3){result=su1*su2;}
  else if(yon == 4){result=su1/su2;}
  System.out.println("���:"+ result);
  
 }
}
class Score2{
 Scanner sc = new Scanner(System.in);
 int kor;//����
 int eng;//����
 int mat;//����
 Score2()
 {
  System.out.print("����:");
  kor = sc.nextInt();
  System.out.print("����:");
  eng = sc.nextInt();
  System.out.print("����:");
  mat = sc.nextInt();
 }
}

class ABan extends Score2{
 Scanner sc = new Scanner(System.in);
 int soc;//��ȸ
 int sie;//����
 int tot, avg;
 ABan()
 {
  System.out.print("��ȸ:");
  soc = sc.nextInt();
  System.out.print("����:");
  sie = sc.nextInt();
  tot = kor+eng+mat+soc+sie;
  avg = tot/5;
  System.out.println("����:"+tot+"/���:"+avg);
 }

}
class BBan extends Score2{
 Scanner sc = new Scanner(System.in);
 int mus;//����
 int art;//�̼�
 int tot, avg;
 BBan()
 {
  System.out.print("����:");
  mus = sc.nextInt();
  System.out.print("�̼�:");
  art = sc.nextInt();
  tot = kor+eng+mat+mus+art;
  avg = tot/5;
  
  System.out.println("����:"+tot+"/���:"+avg);
 }
 
}


public class Study0118a {
 
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int select;
  while(true)
  {
   System.out.println("1.����");
   System.out.println("2.A������ó��");
   System.out.println("3.B������ó��");
   System.out.println("4.����");
   System.out.print("����:");
   select = sc.nextInt();
   if(select == 1){Calc c = new Calc();}
   else if(select==2){ABan a = new ABan();}
   else if(select == 3){BBan b = new BBan();}
   else if(select == 4){break;}
  }
  
  
  
 }
}

 