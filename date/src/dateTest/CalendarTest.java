package dateTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		// 싱글톤 패턴
		
		//singleton pattern
		/*
		 * 싱글톤 패턴을 이용한 클래스는 어플리케이션 내에 딱 하나의 객체만 만들어 사용할 수 있다.
		 * getInstance()라는 메소드를 이용하여 이미 만들어진 객체의 참조값을 얻어와 사용하는 것이다.
		 */
		Calendar today = Calendar.getInstance();
		
//		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Calendar -> Date 으로 변환  getTime()
		String myDay = sdf.format(today.getTime());
		System.out.println(myDay);
		
		today.set(Calendar.DATE, 27);
		System.out.println(sdf.format(today.getTime()));
		
		today.set(Calendar.MONTH, 1);
		System.out.println(sdf.format(today.getTime()));
		
		System.out.println(today.get(Calendar.MONTH)+1);
		
		//add(int field, int amount)
		//날짜를 연산할 수 있다.
		today.add(Calendar.DATE, 27);
		System.out.println(sdf.format(today.getTime()));
		
	}
}
