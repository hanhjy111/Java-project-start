import java.awt.Frame;

public class ttBB {
 public static void main(String[] args) {
  TTT tt = new TTT();
  tt.start();
  
  BBB bbb =new BBB();
  Thread th = new Thread(bbb);
  th.start();

 }

}
class BBB extends Frame implements Runnable{

 
 public void run() {
  while(true)
  {
   try {
    Thread.sleep(1000);
    System.out.println("BBBŬ����!");
   } catch (InterruptedException e) { }
   
  }
  
 }
 
}

class TTT extends Thread{
 
 public void run()
 {
  while(true)
  {
   try {
    sleep(1000);
    System.out.println("�����嵿����!");
   } catch (InterruptedException e) { }
   
  }
 }
}