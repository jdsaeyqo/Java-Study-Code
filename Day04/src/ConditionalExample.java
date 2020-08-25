
public class ConditionalExample {

	public static void main(String[] args) {
		
		int r = (int)(Math.random()*10);
		System.out.println(r);
		
		//3항 조건 연산자(조건식 ? 연산식1:연산식 2)
		//true면 연산식1 수행, false면 연산식2 수행
		int abs = (r >=0) ? r:-r;

	}

}
