package apple2;

public class Apple2 {
	public static void main(String[] args) {
		
		Buyer2 cat1 = new Buyer2(10000, 0, "»õ¿ì±ø");
		Buyer2 cat2 = new Buyer2(5000, 0, "¶¥Äá");
		//Seller sell = new Seller(); 
		
		Seller2.showSeller();
		System.out.println();
		cat1.showBuyer();
		cat2.showBuyer();
		
		cat1.buy();
		cat2.buy();
		System.out.println("----------------------------------");
		
		Seller2.showSeller();
		System.out.println();
		cat1.showBuyer();
		cat2.showBuyer();
		
		
		
		
		
		/* º¯¼ö Á¢±ÙÁ¦ÇÑ
		cat1.name = "»õ¿ì±ø";
		cat2.name = "¶¥Äá";
		*/
		/* ÃÊ±â°ªÀ» ¼³Á¤ÇÏ±â À§ÇÑ ¸ñÀû : »ý¼ºÀÚ º¯°æ
		cat1.setBuyer(10000, 0, "»õ¿ì±ø");
		cat2.setBuyer(5000, 0, "¶¥Äá");
		*/
		
		
	}//End main
}//End class
