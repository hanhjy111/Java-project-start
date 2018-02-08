package apple2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Buyer2 {
	private int money;
	private int numOfApple;
	private String name;
	
	// 생성자 - 오버로딩
	Buyer2(){ this(10000, 0, "구매자"); }
	
	Buyer2(int money, int numOfApple, String name){
		this.money = money;
		this.numOfApple = numOfApple;
		this.name = name;
	}
	
	void showBuyer() {
		System.out.println("[구매자-"+name+"]");
		System.out.println("돈 : "+money+"원");
		System.out.println("바구니 : "+numOfApple);
	}
	
	/* 생성자로 대체
	void setBuyer(int money, int numOfApple, String name) {
		this.money = money;
		this.numOfApple = numOfApple;
		this.name = name;
	}
	*/
	void buy(){
		System.out.println("** ["+name+"]이(은) 구매를 시작합니다.");
		int tempApp = selectApp();
		
		System.out.println("@ "+name+" : 아저씨 사과 "+tempApp+"개 주세요.");
		//Seller s = new Seller();			// seller 정의
		int appMoney = Seller2.sell(tempApp);		// 지불가격
		
		// 사과의 개수가 부족해서 프로그램이 종료되는 if문 필요
		if(appMoney==0) {
			System.out.println("---- 구매실패 : 사과 개수 부족 -----");
			return;
		}
		
		if(money<appMoney) {
			System.out.println("** ["+name+"]님, 잔액부족!!");
			return; 
		}
		
		boolean r = Seller2.sell(tempApp, appMoney, name);
		
		if(r){
			money -= appMoney;
			numOfApple += tempApp;
			System.out.println(name+" : 구매성공");
		}

	}//End buy
	
	int selectApp() {
		Scanner scan = new Scanner(System.in);
		int nApp = 0;
		System.out.print("++ 구매하려는 사과 개수를 입력하세요 : ");
		nApp = scan.nextInt();
		return nApp;
	}
	
}














