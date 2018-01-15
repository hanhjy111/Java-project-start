import java.util.Scanner;
public class SwitchControlTest_1 {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		byte jumin_07 = -1;
		short year = 0;
		String gender = "";
		
		System.out.print("주민등록번호 7번째 자리 = ");
		jumin_07 = in.nextByte();
		switch(jumin_07) {
			case 9: case 0: year = 1000; break;
			case 1: case 2: year = 1900; break;
			case 3: case 4: year = 2000; break;
			default: year = -1;
			
		}
		
		if(year != -1)  {
			gender = jumin_07 % 2 == 0 ? "여성" : "남성";
			
		}
		
		in.close();
		
		System.out.println();
		System.out.println("당신은 " + year + "년대 " + gender + "입니다.");
		
		
		
	}

}
