import java.util.Calendar;
import java.util.TimeZone;
public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar calendar = Calendar.getInstance(timeZone);
		
		System.out.println("���� = " + calendar.get(Calendar.YEAR));
		System.out.println("�� = " + (calendar.get(Calendar.MONTH)));
		System.out.println("�� = " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� = " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� = " + calendar.get(Calendar.MINUTE));
		System.out.println("�� = " + calendar.get(Calendar.SECOND));
		
		System.out.println("���ݺ��� 3�� �Ĵ� ?");
		calendar.add(Calendar.DAY_OF_MONTH,  3);
		System.out.println("�� = " + (calendar.get(Calendar.MONTH)+1));
		System.out.println("�� = " + calendar.get(Calendar.DAY_OF_MONTH));
	}

}
