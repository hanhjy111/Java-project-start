//  4.���ϰ� 0   ���ް� 0
//   - ö���� 10000�� ���״� �ܹ����� �����
//   - ����� 10000�� �� �޾Ҿ� ������� ������
//   - ö���� ������� �� �޾Ҿ�~!
public class chulsu_return4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	String buggerName = chulsu4(10000);
	System.out.println("ö����"+buggerName+"�߹޾Ҿ�~!");
	}  
	 static String chulsu4(int money)
	 {
	  System.out.println("ö���� "+money+"�� ���״� �ܹ����� �����");
	  System.out.println("����� "+money+"�� �� �޾Ҿ� ������� ������");
	  
	  return "�������";
	 }
}
