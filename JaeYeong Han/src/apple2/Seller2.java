package apple2;

public class Seller2 {

	// �Ӽ� - �ν��Ͻ� ����
	// static : ����� ���ÿ� �ʱ�ȭ �Ѵ�.
	static int numOfApple = 10;
	static final int price = 1500;
	static int money = 0;
	static String name = "�̻̽�����";
	
	/* static ���������� ������� �ʴ´�.
	Seller(){ this(5, 1500, 0, "�̻̽�����" ); }
	Seller(int numOfApple, int price, int money, String name){
		this.numOfApple = numOfApple;
		this.price = price;
		this.money = money;
		this.name = name;
	}
	*/
	
	static void showSeller() {
		System.out.println("["+name+"]");
		System.out.println("��� : "+numOfApple+"��");
		System.out.println("���� : "+price+"��");
		System.out.println("�� : "+money);
	}
	
	// ��� - ����
	static int sell(int tempApp){
		System.out.println("���������� ��� "+tempApp+"���� �����Ϸ��մϴ�.");
		
		if(tempApp>numOfApple) {
			System.out.println("����� ������ �����մϴ�!! �˼��մϴ�!!");
			return 0;
		}
		
		int appMoney = tempApp * price;
		return appMoney;
		
	}//End sell
	
	static boolean sell(int tempApp, int tempMoney, String bName){
		System.out.println("** "+bName
				+"���κ��� ����� �ݾ� "+tempMoney+"���� �޾ҽ��ϴ�.");
		money += tempMoney;
		numOfApple -= tempApp;
		return true;
	}
	
}














