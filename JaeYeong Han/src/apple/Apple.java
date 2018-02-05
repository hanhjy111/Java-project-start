package apple;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				Buyer cat1 = new Buyer(10000, 0, "구매자");
				Buyer cat2 = new Buyer();
				// 초기화
				
				cat1.showBuyer(); 
				cat2.showBuyer();  
				
				Seller ap1 = new Seller();
				Seller ap2 = new Seller();
				
				ap1.sell();
				ap2.sell();
				
				
						
				/* 변수 접근 제한 private 로 인하여
				cat1.name = "새우깡"; //오브젝트
				cat2.name = "땅콩";
				*/
				
				/* 초기값을 설정하기 위한 목적 : 생성자 변경
				cat1.setBuyer(10000, 0, "새우깡");
				cat2.setBuyer(5000, 0, "땅콩");
				*/
				
				
				
			}//End main

		}//End Class