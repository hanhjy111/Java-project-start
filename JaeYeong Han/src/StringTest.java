public class StringTest {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

 

		String str = new String(" Hello! how are you");

		System.out.println("���ڿ� ���� = " + str.length());

		System.out.println("ù��° '��'���ڴ� �� ��° ��ġ = " + str.indexOf("o"));

		System.out.println("������ '��'���ڴ� �� ��° ��ġ = " + str.lastIndexOf("o"));

		System.out.println("3 ~ 7 ��° ��ġ�� ���ڿ� = " + str.substring(3, 7));

		System.out.println("12��° ��ġ�� ���� = " + str.charAt(12));

		System.out.println("�����ϴ� ���ڿ��� ' He'�̴�? " + str.startsWith("He"));

		System.out.println("������ ���ڿ��� '?!' �̴�?" + str.endsWith("?!"));

		System.out.println("���ڿ� �ڿ� 'ok?!'�� �߰��ϸ� = " + str.concat("ok?!"));

		System.out.println("�� �� ������ �����ϰ� ����ϸ� = [" + str.trim() + "]");

		System.out.println("' Hello! ' �� ���ϸ� ����� �� ũ�� ? " + str.compareTo(" Hello! "));

		byte[] data = str.getBytes();

		System.out.println("�� ���ڿ��� byte �迭�� �����ϸ� ? " + data);

		System.out.println("���ڿ��� ��� �ִ� ? " + str.isEmpty());

		System.out.println("������ �������� ���ڿ��� �ڸ��� ������ ����.");

		String[] data2 = str.split(" ");

		for(int n = 0; n < data2.length; ++n)

		{

			System.out.println(n + " --> " + data2[n]);

		}

		System.out.println("��ü�� �빮�ڷ� �ٲٸ� = " + str.toUpperCase());

		System.out.println("��ü�� �ҹ��ڷ� �ٲٸ� = " + str.toLowerCase());

	}

 

}

