package static_.method;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * static이 붙은 멤버는 객체 생성없이 클래스 이름으로 직접 참조가 가능
		 */
		System.out.println(Count.method2());
		Count.b +=50;
		System.out.println(Count.method2());
		Count.b -=20;
		System.out.println(Count.method2());
		
		System.out.println("=======================");
		Count c1 = new Count();
		c1.a +=30;
		System.out.println(c1.method1());
		
		Math.random();
		System.out.println(Math.PI);


	}

}
