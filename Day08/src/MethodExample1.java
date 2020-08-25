/*
 * 1. 메서드는 정의(선언)하는 과정과 호출하는 과정이 있음
 * 2. 메서드 선언은 메서드 내부에서는 할 수 없습니다. 반드시 메서드 블록
 * 외부에서만 선언 가능. 클래스 내부라면 어떤 위치든 선언 가능
 * 3. 메서드 내부에서는 다른 메서드의 호출만 가능.
 * 4. 호출하는 과정은 메서드를 사용하는 과정이며 해당 메서드가 필요로 하는
 * 데이터(매개값)를 메서드 내부로 전달하면서 해당 메서드는 매개값을 통해 
 * 처리한 결과값을 호출부로 다시 반환
 */



public class MethodExample1 {
	
	public static int calcSum2(int x, int y) {
		
		int sum = 0;
		for (int i = x; i <=y; i++) {
			sum +=i;
			
		}return sum;
	}
	
                //결과 자료형        //입력 자료형
	public static int calcSum(int x) {
		int sum = 0;
		for (int i =1; i <= x ; i++) {
			sum +=i;

		}return sum;
	}
	
	
	public static void main(String[] args) {



		System.out.println("1~10 까지의 누적합 : "+calcSum(10));
		System.out.println("1~20 까지의 누적합 : "+calcSum(20));
		
		int result = calcSum(100);   //함수의 호출!
		System.out.println(result);
		System.out.println("4부터 7까지의 누적합 : "+calcSum2(4, 7));



	}

}
