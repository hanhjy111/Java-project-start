package apple2;

public class Apple2 {
	public static void main(String[] args) {
		
		Buyer2 cat1 = new Buyer2(10000, 0, "�����");
		Buyer2 cat2 = new Buyer2(5000, 0, "����");
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
		
		
		
		
		
		/* ���� ��������
		cat1.name = "�����";
		cat2.name = "����";
		*/
		/* �ʱⰪ�� �����ϱ� ���� ���� : ������ ����
		cat1.setBuyer(10000, 0, "�����");
		cat2.setBuyer(5000, 0, "����");
		*/
		
		
	}//End main
}//End class
