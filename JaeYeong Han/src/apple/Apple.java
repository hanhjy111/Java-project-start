package apple;

public class Apple {
	public static void main(String[] args) {
		
		Buyer cat1 = new Buyer(10000, 0, "�����");
		Buyer cat2 = new Buyer(5000, 0, "����");
		Seller sel = new Seller(); 
		
		sel.showSeller();
		System.out.println();
		cat1.showBuyer();
		cat2.showBuyer();
		
		cat1.buy(sel);
		cat2.buy(sel);
		System.out.println("----------------------------------");
		
		sel.showSeller();
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
