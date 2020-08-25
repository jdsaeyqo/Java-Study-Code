package static_singleton;

public class MainClass {

	public static void main(String[] args) {

//		Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		//아무리 많이 써도 모두 주소값 같으므로 하나만 호출한 격.
	}

}
