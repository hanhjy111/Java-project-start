import java.util.Date;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		System.out.println("연도 = " + (1900 + date.getYear()));
		System.out.println("월 = " + (date.getMonth()+1));
		System.out.println("일 = " + (date.getDate()));
		System.out.println("시 = " + (date.getHours()));
		System.out.println("분 = " + (date.getMinutes()));
		System.out.println("초 = " + (date.getSeconds()));
	}

}
