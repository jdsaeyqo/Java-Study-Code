package Exception.runtime;

public class NullPointerExample {

	public static void main(String[] args) {
		
		String str = null; 
		str = "HELLO";
		System.out.println(str.toLowerCase()); // null값을 (.)으로 실행할 때 오류
		

	}

}
