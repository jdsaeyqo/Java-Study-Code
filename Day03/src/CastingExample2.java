
public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 데이터를 작은 데이터타입으로 변환하려면
		 * 반드시 캐스트 연산자(type)를 사용하여
		 * 명시적으로 형 변환을 해야합니다.(Downcasting)
		 */
		
		int i = 72;
		char c = (char)i; //int -> char 로 강제 변환
		System.out.println(c);
		/*
		 * 강제 형변환의 경우 데이터 손실이 일어날 가능성이 있기 때문에
		 * 명시적으로 타입을 변환
		 */

		double d = 4.83123;
		int j = (int)d;
		System.out.println(j);
		
		/*
		 * 강제 형변환 시 주의점은 해당 데이터 타입이 받아들일 수 있는 범위가 아닌
		 * 데이터가 들어오면 오버플로, 언더플로가 일어남.
		 */
		int k = 1000;
		byte b = (byte)k;
		System.out.println(b);
	}

}
