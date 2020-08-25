package modi.member.pac1;

public class B {
	
	public B() {

		A a = new A();
		
		a.a=1;
		a.b=2;
//		a.c=3; //private (x)
		
		a.method1();
		a.method2();
//		a.method3(); //private (x)
	}

}
