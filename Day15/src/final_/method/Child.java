package final_.method;

public class Child extends Parent {

	
	public void method1() {}
	public void method2() {}
//	public void method3() {}
	
	public Child() {
		
		method1();
		method2();
		method3();
		
		//클래스에 final이 안 붙으면 상속해서 사용은 가능하지만 재정의 불가
	}
	
	

}
