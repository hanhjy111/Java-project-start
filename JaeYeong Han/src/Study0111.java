import java.util.Scanner;

public class Study0111 {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  //������ Ű ���� ����
  int weight=0, height=0;
  
  while(true)
  {
   System.out.println("<�Ƴ�üũ���α׷�>");
   System.out.println("1.�����Է�");
   System.out.println("2.�Ƴ�üũ");
   System.out.println("3.����");
   System.out.print("����:");
   int select = sc.nextInt(); 
   
   if(select == 1)  {
    System.out.print("Ű:");
    height = sc.nextInt();
    System.out.print("������:");
    weight = sc.nextInt();
   }
   else if(select == 2){
    
    if(height >=180 && height<=190)
    {
     if(weight>=70 && weight<=80)
     {
      System.out.println("����� �Ƴ��Դϴ�.");
     }
    }
    else if(height >=165 && height<=179)
    {
     if(weight>=60 && weight<=85)
     {
      System.out.println("����� �����Դϴ�.");
     }
    }
    else if(height >195 || height<165)
    {
     if(weight>85 || weight<60)
     {
      System.out.println("����� �߳��Դϴ�.");
     }
    }    
    
   }
   else if(select == 3){break;}
   
  }
  
  System.out.println("���α׷��� �����մϴ�");

 }

} 