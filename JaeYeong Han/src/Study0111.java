import java.util.Scanner;

public class Study0111 {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  //몸무게 키 변수 선언
  int weight=0, height=0;
  
  while(true)
  {
   System.out.println("<훈남체크프로그램>");
   System.out.println("1.정보입력");
   System.out.println("2.훈남체크");
   System.out.println("3.종료");
   System.out.print("선택:");
   int select = sc.nextInt(); 
   
   if(select == 1)  {
    System.out.print("키:");
    height = sc.nextInt();
    System.out.print("몸무게:");
    weight = sc.nextInt();
   }
   else if(select == 2){
    
    if(height >=180 && height<=190)
    {
     if(weight>=70 && weight<=80)
     {
      System.out.println("당신은 훈남입니다.");
     }
    }
    else if(height >=165 && height<=179)
    {
     if(weight>=60 && weight<=85)
     {
      System.out.println("당신은 보통입니다.");
     }
    }
    else if(height >195 || height<165)
    {
     if(weight>85 || weight<60)
     {
      System.out.println("당신은 추남입니다.");
     }
    }    
    
   }
   else if(select == 3){break;}
   
  }
  
  System.out.println("프로그램을 종료합니다");

 }

} 