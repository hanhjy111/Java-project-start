import java.util.Calendar;
import java.util.TimeZone;
public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar calendar = Calendar.getInstance(timeZone);
		
		System.out.println("연도 = " + calendar.get(Calendar.YEAR));
		System.out.println("월 = " + (calendar.get(Calendar.MONTH)));
		System.out.println("일 = " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("시 = " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 = " + calendar.get(Calendar.MINUTE));
		System.out.println("초 = " + calendar.get(Calendar.SECOND));
		
		System.out.println("지금부터 3일 후는 ?");
		calendar.add(Calendar.DAY_OF_MONTH,  3);
		System.out.println("월 = " + (calendar.get(Calendar.MONTH)+1));
		System.out.println("일 = " + calendar.get(Calendar.DAY_OF_MONTH));
	}

}
