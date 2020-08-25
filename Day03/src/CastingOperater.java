
public class CastingOperater {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		char cc = (char)(c + i);
		int ii = c + i;
		System.out.println(cc);
		System.out.println(ii);
		
		int j = 10;
		double d = (double)j/4;
		System.out.println(d);
		
		
		//int보다 작은 데이터의 연산은 int로 자동변환됨
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte) (b1+b2);
		System.out.println(b3);
		
		

	}

}
