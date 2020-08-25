package overloading.basic;
/*
 * 
 *오버로딩(중복) - 하나의 클래스 내부에 같은 이름을 가진 메서드를 여러개 선언할 수 있게 하는 문법
 *
 *
 *1. 매개 변수의 데이터 타입이 달라야함
 *2. 매개 변수 순서 달라야함
 *3. 매개 변수 개수 달라야함
 *
 */

	
public class Basic {
	
	//input(int)
	void input(int a) {
		System.out.println("정수 1개 입력");
	}
//	//input(int)
//	void input(int i) {
//		System.out.println("정수 1개 입력");
//	}
	
//	String input(int x) {
//		
//	}
	//input(String)
	void input(String s) {
		System.out.println("정수 1개 입력");

	}
	//input(int, int)
	void input(int a, int b) {
		System.out.println("정수 2개 입력");

	}
	//input(String, double)
	void input(String s , double d) {
		System.out.println("문자열 1개와 실수 1개 입력");
	}
	
	void input(double x , String y) {
		System.out.println("실수 1개와 문자열 1개가 입력");
	}
	

}
