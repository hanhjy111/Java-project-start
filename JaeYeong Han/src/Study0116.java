import java.util.Scanner;

public class Study0116 
{
 public static void main(String[] args) {
  Score s = new Score();  
 }

}
class Score{
 Scanner sc = new Scanner(System.in);
  int kor;//����
  int eng;//����
  int mat;//����
  int tot,avg;//����,���
  
  //������
  Score()
  {    
   System.out.print("����:"); 
   kor = sc.nextInt();
   System.out.print("����:");
   eng = sc.nextInt();   
   System.out.print("����:");
   mat = sc.nextInt();
   tot = kor+eng+mat;
   avg = tot/3;
   System.out.println("����:"+tot+"/���:"+avg);
  }

}