package apple;

public class Seller 
{

	// �Ӽ� - �ν��Ͻ� ����
	int numOfApple;
	final int price;
	int money;
	String name;
	
	Seller(){ this(5, 1500, 0, "�̻̽�����" ); }
	Seller(int numOfApple, int price, int money, String name)
	{
		this.numOfApple = numOfApple;
		this.price = price;
		this.money = money;
		this.name = name;
	}
	
	void showSeller() {
		System.out.println("["+name+"]");
		System.out.println("��� : "+numOfApple+"��");
		System.out.println("���� : "+price+"��");
		System.out.println("�� : "+money);
	}
	
	// ��� - ����
	int sell(int tempApp){
		System.out.println("���������� ��� "+tempApp+"���� �����Ϸ��մϴ�.");
		
		if(tempApp>numOfApple) {
			System.out.println("����� ������ �����մϴ�!! �˼��մϴ�!!");
			return 0;
		}
		
		int appMoney = tempApp * price;
		return appMoney;
		
	}//End sell
	
	boolean sell(int tempApp, int tempMoney, String bName){
		System.out.println("** "+bName
				+"���κ��� ����� �ݾ� "+tempMoney+"���� �޾ҽ��ϴ�.");
		money += tempMoney;
		numOfApple -= tempApp;
		return true;
	}
	
}















		
		Seller(int numofApple, int price, int money, String n)
		{
			this.numofApple = numofApple;
			this.price = price;
			this.money = money;
			name = n;
		}
		
		void showSEller()
		{
			System.out.println("[name]");
			System.out.println("��� :" +numofApple+"��");
			System.out.println("���� : " +price+"��");
			System.out.println("�� : "+money);
		}
		// ��� = ���
		void sell()
		{
			
			
		}//End sell
		
}
