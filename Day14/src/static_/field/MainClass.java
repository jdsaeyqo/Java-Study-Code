package static_.field;

public class MainClass {

	public static void main(String[] args) {

		Count c1 = new Count();
		
		c1.a++;
		c1.b++;
		System.out.println("일반 멤버변수 a : "+c1.a);
		System.out.println("정적 멤버변수 b : "+c1.b);
		
		Count c2 = new Count();
		
		c2.a++;
		c2.b++;
		System.out.println("일반 멤버변수 a : "+c2.a);
		System.out.println("정적 멤버변수 b : "+c2.b);
		
		/*
		 * static멤버는 객체와 무관하기 때문에 클래스 이름만으로 참조하여 사용합니다.
		 */
		
		Count.b++;
		Count.b++;
		System.out.println("정적 멤버변수 b : "+c1.b);
		System.out.println("정적 멤버변수 b : "+c2.b);

	}

}
