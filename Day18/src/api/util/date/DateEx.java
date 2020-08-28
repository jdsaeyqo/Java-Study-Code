package api.util.date;
//날짜의 표현형식을 바꿔주는 라이브러리
import java.text.SimpleDateFormat;

import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd a HH:mm:ss \n오늘은 E요일입니다. 오늘은 1년 중 D번째 날입니다");
		
		System.out.println(sdf1.format(date));
		

		
	}

}
