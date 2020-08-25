
public class VariableBasic {

	public static void main(String[] args) {
		/*
		 * 변수의 선언
		 * ex) [자로형] [변수 식별자 이름];
		 * 
		 * 변수는 동일한 이름으로 중복 선언할 수 없다
		 * int는 정수, String은 문자열
		 */
		int score;
		
		score = 50;
		System.out.println(score);
		
		//뱐수의 선언과 초기화 동시 가능
		int life = 3;
		
		//변수에는 다른 변수의 값을 저장할 수도 있습니다.
		int result = score + life;
		System.out.println(result);
		
		//변수에 저장된 값은 언제든지 변경 가능
		life = 7;
		System.out.println(life);
		
		//변수는 자료형이 다르더라도 동일이름으로 중복선언할 수 없다.
//		String score; (X) 
//		score="abc:;"
		
		
	}

}
