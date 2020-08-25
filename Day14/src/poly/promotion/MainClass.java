package poly.promotion;

public class MainClass {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.method1();
		p1.method2();
		
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		
		System.out.println("===다형성 적용===");
		Parent p2 = c1;		//다형성에 의해 Child => Parent : Promotion
		System.out.println(c1==p2);
		System.out.println(p2);
		
		p2.method1();
		p2.method2();
//		p2.method3();		불가
		/*
		 * 다형성을 적용하여 자식, 객체를 부모 타입으로 형 변환했을 시에 자식이 가지고 있는 본래의 멤버
		 * (멤버변수, 메서드)에 접근할 수 없는 문제가 발생.
		 * 다만, 재정의된 메서드는 정상적으로 호출할 수 있음.
		 */
				
	}
	
		

}
