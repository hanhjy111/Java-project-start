package apple2;

public class Seller2 {

	// 속성 - 인스턴스 변수
	// static : 선언과 동시에 초기화 한다.
	static int numOfApple = 10;
	static final int price = 1500;
	static int money = 0;
	static String name = "싱싱사과장수";
	
	/* static 구조에서는 사용하지 않는다.
	Seller(){ this(5, 1500, 0, "싱싱사과장수" ); }
	Seller(int numOfApple, int price, int money, String name){
		this.numOfApple = numOfApple;
		this.price = price;
		this.money = money;
		this.name = name;
	}
	*/
	
	static void showSeller() {
		System.out.println("["+name+"]");
		System.out.println("사과 : "+numOfApple+"개");
		System.out.println("가격 : "+price+"원");
		System.out.println("돈 : "+money);
	}
	
	// 기능 - 동작
	static int sell(int tempApp){
		System.out.println("사과장수에게 사과 "+tempApp+"개를 구매하려합니다.");
		
		if(tempApp>numOfApple) {
			System.out.println("사과의 개수가 부족합니다!! 죄송합니다!!");
			return 0;
		}
		
		int appMoney = tempApp * price;
		return appMoney;
		
	}//End sell
	
	static boolean sell(int tempApp, int tempMoney, String bName){
		System.out.println("** "+bName
				+"으로부터 사과의 금액 "+tempMoney+"원을 받았습니다.");
		money += tempMoney;
		numOfApple -= tempApp;
		return true;
	}
	
}














