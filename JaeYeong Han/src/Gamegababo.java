import java.util.Scanner;

public class Gamegababo {

 public static void main(String[] args) {  
  Scanner sc = new Scanner(System.in);
  int select;
  int myChoice ; //1:���� 2:���� 3:��
  int comChoice ; //1:���� 2:���� 3:��
  while(true)
  {
   System.out.println("1.���ӽ���");   
   System.out.println("2.����");
   System.out.print("����:");
   select = sc.nextInt();
   if(select == 1){
    System.out.println("1.���� / 2.���� / 3.��");
    System.out.print("������:");
    myChoice = sc.nextInt();
    System.out.println("��ǻ�Ͱ� �������Դϴ�!");
    for(int i=5; i>0;i--)
    {
     try {
      Thread.sleep(800);
      System.out.println(i);
     } catch (InterruptedException e) {
     }     
    }
    comChoice = (int)Math.random() *3 +1;
    
    if(myChoice == 1) {System.out.println("�� ����!");}
    else if(myChoice == 2) {System.out.println("�� ����!");}
    else if(myChoice == 3) {System.out.println("�� ��!");}

    if(comChoice == 1) {System.out.println("��ǻ�ʹ� ����!");}
    else if(comChoice == 2) {System.out.println("��ǻ�ʹ� ����!");}
    else if(comChoice == 3) {System.out.println("��ǻ�ʹ� ��!");}
    
    if(myChoice ==1)
    {
     if(comChoice ==1) {System.out.println("���ǹ��º�!");}
        else if(comChoice ==2) {System.out.println("�����й�!");}
     else if(comChoice ==3) {System.out.println("���ǽ¸�!");}
    }
    else if(myChoice ==2)
    {
     if(comChoice ==1) {System.out.println("���ǽ¸�!");}
        else if(comChoice ==2) {System.out.println("���ǹ��º�!");}
     else if(comChoice ==3) {System.out.println("�����й�!");}
    }
    else if(myChoice ==3)
    {
     if(comChoice ==1) {System.out.println("�����й�!");}
        else if(comChoice ==2) {System.out.println("���ǽ¸�!");}
     else if(comChoice ==3) {System.out.println("���ǹ��º�!");}
    }
   }   
   
   else if(select == 2){
    System.out.println("���α׷�����!");
    break;
   }
  }  
  
 }
} 