package static_init;

public class MainClass {

	public static void main(String[] args) {

//		Computer com= new Computer();
//		System.out.println(com.info);
		
		
		/*
		 - 정적 초기화자를 호출하려면 클래스를 로딩해야 합니다.
		 클래스 로딩 방법 : 
		 1. 객체를 생성
		 2. 클래스 이름을 통해 정적 멤버에 접근
		 */
		System.out.println(Computer.info);
		
	}

}
