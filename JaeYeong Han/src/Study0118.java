import java.awt.Frame;
import java.util.Scanner;

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


public class Study0118 {

 public static void main(String[] args) {
  ABan a = new ABan();
  BBan b = new BBan();
  
 }
}

 