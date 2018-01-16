import java.io.IOException;
import java.util.Scanner;

public class Study0111_2
{
 
 public static void main(String[] args)
 { 
  Scanner sc = new Scanner(System.in);
  
  //변수설계 2차원배열
  String info[][] = new String[3][3];
  
  System.out.println("=======================");
  System.out.println("   <3명의 인원정보입력>    ");
  System.out.println("=======================");
  
  for(int i = 0; i < 3; i++)
  {
   System.out.print(i+1+"번이름:");
   info[i][0] = sc.next();
   System.out.print(i+1+"번나이:");
   info[i][1] = sc.next();
   System.out.print(i+1+"번사는곳:");
   info[i][2] = sc.next();
  }
  for(int i = 0; i < 3; i++)
  {
   System.out.println(i+1 + "번 : " + info[i][0]+" / " + info[i][1] + " / " +
      info[i][2]);
  }

 }
} 