package apple;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Buyer {
	private int money;
	private int numOfApple;
	private String name;
	
	// ������ - �����ε�
	Buyer(){ this(10000, 0, "������"); }
	
	Buyer(int money, int numOfApple, String name){
		this.money = money;
		this.numOfApple = numOfApple;
		this.name = name;
	}
	
	void showBuyer() {
		System.out.println("[������-"+name+"]");
		System.out.println("�� : "+money+"��");
		System.out.println("�ٱ��� : "+numOfApple);
	}
	
	/* �����ڷ� ��ü
	void setBuyer(int money, int numOfApple, String name) {
		this.money = money;
		this.numOfApple = numOfApple;
		this.name = name;
	}
	*/
	void buy(Seller s){
		System.out.println("** ["+name+"]��(��) ���Ÿ� �����մϴ�.");
		int tempApp = selectApp();
		
		System.out.println("@ "+name+" : ������ ��� "+tempApp+"�� �ּ���.");
		//Seller s = new Seller();			// seller ����
		int appMoney = s.sell(tempApp);		// ���Ұ���
		
		// ����� ������ �����ؼ� ���α׷��� ����Ǵ� if�� �ʿ�
		if(appMoney==0) {
			System.out.println("---- ���Ž��� : ��� ���� ���� -----");
			return;
		}
		
		if(money<appMoney) {
			System.out.println("** ["+name+"]��, �ܾ׺���!!");
			return; 
		}
		
		boolean r = s.sell(tempApp, appMoney, name);
		
		if(r){
			money -= appMoney;
			numOfApple += tempApp;
			System.out.println(name+" : ���ż���");
		}

	}//End buy
	
	int selectApp() {
		Scanner scan = new Scanner(System.in);
		int nApp = 0;
		System.out.print("++ �����Ϸ��� ��� ������ �Է��ϼ��� : ");
		nApp = scan.nextInt();
		return nApp;
	}
	
}














