package apple;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				Buyer cat1 = new Buyer(10000, 0, "������");
				Buyer cat2 = new Buyer();
				// �ʱ�ȭ
				
				cat1.showBuyer(); 
				cat2.showBuyer();  
				
				Seller ap1 = new Seller();
				Seller ap2 = new Seller();
				
				ap1.sell();
				ap2.sell();
				
				
						
				/* ���� ���� ���� private �� ���Ͽ�
				cat1.name = "�����"; //������Ʈ
				cat2.name = "����";
				*/
				
				/* �ʱⰪ�� �����ϱ� ���� ���� : ������ ����
				cat1.setBuyer(10000, 0, "�����");
				cat2.setBuyer(5000, 0, "����");
				*/
				
				
				
			}//End main

		}//End Class