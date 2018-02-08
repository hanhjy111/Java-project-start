package apple;

public class Seller 
{

	// 속성 - 인스턴스 변수
	int numOfApple;
	final int price;
	int money;
	String name;
	
	Seller(){ this(5, 1500, 0, "싱싱사과장수" ); }
	Seller(int numOfApple, int price, int money, String name)
	{
		this.numOfApple = numOfApple;
		this.price = price;
		this.money = money;
		this.name = name;
	}
	
	void showSeller() {
		System.out.println("["+name+"]");
		System.out.println("사과 : "+numOfApple+"개");
		System.out.println("가격 : "+price+"원");
		System.out.println("돈 : "+money);
	}
	
	// 기능 - 동작
	int sell(int tempApp){
		System.out.println("사과장수에게 사과 "+tempApp+"개를 구매하려합니다.");
		
		if(tempApp>numOfApple) {
			System.out.println("사과의 개수가 부족합니다!! 죄송합니다!!");
			return 0;
		}
		
		int appMoney = tempApp * price;
		return appMoney;
		
	}//End sell
	
	boolean sell(int tempApp, int tempMoney, String bName){
		System.out.println("** "+bName
				+"으로부터 사과의 금액 "+tempMoney+"원을 받았습니다.");
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
			System.out.println("사과 :" +numofApple+"개");
			System.out.println("가격 : " +price+"원");
			System.out.println("돈 : "+money);
		}
		// 기능 = 기능
		void sell()
		{
			
			
		}//End sell
		
}
