package poly.instanceof_;

/*
 * 데이터를 다른 클래스에게 물려주는 클래스를 부모클래스라고 합니다.
 * 상속을 사용할 시 데이터를 물려받는 클래스에게 부모클래스의 멤버변수,
 * 메서드가 상속됩니다.
 * 단, 생성자는 상속되지 않습니다.
 */

public class Person {

	String name;
	int age;


	//생성자 선언
	Person(String name, int age) {
		this.name = name;
		this.age = age;

		//		System.out.println(this.info());
	}

	Person(String name) {
		this(name,1);
	}
	//		this.name = name;
	//		this.age =1;
	//	}
	Person() {
			this("이름없음");
	}

	//		this.name="이름없음";
	//		this.age = 1;

String info() {
	return "이름: " + name + ", 나이 : "+age;

}

}
