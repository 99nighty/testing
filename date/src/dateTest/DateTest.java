package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
//		Date today = new Date();
//		System.out.println(today);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String todayForm = sdf.format(today);
//		System.out.println(todayForm);
		
//		현재 날짜 22년 월/일 --- 시:분:초
		// Date -> String으로 변환
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("현재 날짜 yy년 MM/dd --- hh:mm:ss");
		String todayForm = sdf.format(today);
		System.out.println(todayForm);
		
		// String -> Date로 변환
		// parse()
		try {
			Date myDay = sdf.parse("현재 날짜 20년 07/05 --- 22:31:21");
			System.out.println(myDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//system.currentTimeMillis()
		System.out.println(System.currentTimeMillis());
		
		Date d1 = new Date(System.currentTimeMillis());
		System.out.println(d1);
		
	}
}
