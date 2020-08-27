package exception.throw_;

public class ThrowEx1 {

	public static int calcSum(int n) throws Exception{


		/*
		 * 프로그램이 throw구문을 만나는 순간 즉시 예외를 강제로 발생시키게 되며
		 * 해당 예외를 처리해줄 catch블록을 검색.
		 */

		if ( n <=0) {
			throw new Exception();
			//			System.out.println("매개값을 양수로 전해주세요");
			//			return;    불가 
		}

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum +=i;

		}
		return sum;
	}

	public static void main(String[] args) {

		try {
			int result1 = calcSum(100);
			System.out.println("1 ~ 100까지의 누적 합 : "+result1);
			int result2 = calcSum(-100);
			System.out.println("1 ~ -100까지의 누적 합 : "+result2);
		}catch(Exception e) {
			System.out.println("양수 매개값을 입력해주세요");
		}

	}
}