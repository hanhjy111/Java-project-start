import java.io.IOException;
import java.util.Scanner;

public class Study0111_2
{
 
 public static void main(String[] args)
 { 
  Scanner sc = new Scanner(System.in);
  
  //�������� 2�����迭
  String info[][] = new String[3][3];
  
  System.out.println("=======================");
  System.out.println("   <3���� �ο������Է�>    ");
  System.out.println("=======================");
  
  for(int i = 0; i < 3; i++)
  {
   System.out.print(i+1+"���̸�:");
   info[i][0] = sc.next();
   System.out.print(i+1+"������:");
   info[i][1] = sc.next();
   System.out.print(i+1+"����°�:");
   info[i][2] = sc.next();
  }
  for(int i = 0; i < 3; i++)
  {
   System.out.println(i+1+"�� : "+
      info[i][0]+" / "+info[i][1]+" / " +
      info[i][2]);
  }

 }
} 