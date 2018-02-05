import java.util.Scanner;

public class Gamegababo {

 public static void main(String[] args) {  
  Scanner sc = new Scanner(System.in);
  int select;
  int myChoice ; //1:가위 2:바위 3:보
  int comChoice ; //1:가위 2:바위 3:보
  while(true)
  {
   System.out.println("1.게임시작");   
   System.out.println("2.종료");
   System.out.print("선택:");
   select = sc.nextInt();
   if(select == 1){
    System.out.println("1.가위 / 2.바위 / 3.보");
    System.out.print("내선택:");
    myChoice = sc.nextInt();
    System.out.println("컴퓨터가 생각중입니다!");
    for(int i=5; i>0;i--)
    {
     try {
      Thread.sleep(800);
      System.out.println(i);
     } catch (InterruptedException e) {
     }     
    }
    comChoice = (int)Math.random() *3 +1;
    
    if(myChoice == 1) {System.out.println("난 가위!");}
    else if(myChoice == 2) {System.out.println("난 바위!");}
    else if(myChoice == 3) {System.out.println("난 보!");}

    if(comChoice == 1) {System.out.println("컴퓨터는 가위!");}
    else if(comChoice == 2) {System.out.println("컴퓨터는 바위!");}
    else if(comChoice == 3) {System.out.println("컴퓨터는 보!");}
    
    if(myChoice ==1)
    {
     if(comChoice ==1) {System.out.println("나의무승부!");}
        else if(comChoice ==2) {System.out.println("나의패배!");}
     else if(comChoice ==3) {System.out.println("나의승리!");}
    }
    else if(myChoice ==2)
    {
     if(comChoice ==1) {System.out.println("나의승리!");}
        else if(comChoice ==2) {System.out.println("나의무승부!");}
     else if(comChoice ==3) {System.out.println("나의패배!");}
    }
    else if(myChoice ==3)
    {
     if(comChoice ==1) {System.out.println("나의패배!");}
        else if(comChoice ==2) {System.out.println("나의승리!");}
     else if(comChoice ==3) {System.out.println("나의무승부!");}
    }
   }   
   
   else if(select == 2){
    System.out.println("프로그램종료!");
    break;
   }
  }  
  
 }
} 