import java.util.Date;
import java.util.Scanner;
public class Tpyedate {

 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int select;
  DateLog dd = new DateLog();
  dd.start();
  while(true)
  {
   System.out.println("1.날짜찍기");
   System.out.println("2.멈춤");
   System.out.println("3.종료");
   System.out.print("선택:");
   select = sc.nextInt();
   if(select == 1){
    dd.stopGo=true;
    
   }   
   else if(select == 2){
    dd.stopGo=false;
   }
   else if(select == 3){
    System.out.println("프로그램종료!");
    break;
   }
  }

 }

}

class DateLog extends Thread {
 boolean stopGo=false;
 public void run()
 {
  while(true)
  {
   try {
    sleep(500);
    if(stopGo==true)
    {
     
     Date date = new Date();    
     int year = date.getYear();
     int month = date.getMonth();
     int day = date.getDate();
     int hours = date.getHours();
     int minutes = date.getMinutes();
     int seconds = date.getSeconds();
     System.out.println("현재시각:"+
             (year+1900) +"-"+
       (month+1)+"-"+ 
       day+"-"+ 
       hours+"-"+ 
       minutes+"-"+ 
       seconds     
       ); 
    }
   } catch (InterruptedException e) {    
    e.printStackTrace();
   }
   
  }
 }
} 