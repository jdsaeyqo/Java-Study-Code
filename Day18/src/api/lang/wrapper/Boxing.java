package api.lang.wrapper;

import java.util.Arrays;

public class Boxing {

	public static void main(String[] args) {

		int a =100;
		double b = 3.51;
		char c = 'H';
		boolean d = false;
		//Boxing : 기본타입의 데이터를 객체타입으로 변환.
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		Byte val5 = new Byte((byte)75);
		String val6 = new String("hello");
		
		Object[] arr = {val1,val2,val3,val4,val5,val6};
		System.out.println(Arrays.deepToString(arr));
		
		//Unboxing : 포장된 데이터를 다시 기본타입으로 변환.
		//포장클래스가 제공하는 기본타입이름 + Value()메서드 이용.
		int i = val1.intValue();
		double j = val2.doubleValue();
		
	}
	

}
