package poly.person;

/*
 * 다른 클래스로부터 멤버변수와 메서드를 물려받는 클래스를 자식 클래스라고 함.
 * 자식 클래스의 이름 뒤에 extends라는 키워드를 쓰고 물려받을 클래스의 이름을
 * 써줍니다.
 */

public class Student extends Person {
	
	String stuID;
	
	Student(String name, int age, String stuID) {
		super(name,age);
//		this.name = name;
//		this.age = age;
		this.stuID=stuID;
	}
	
	Student() {
		this("이름없음",1,"학번없음");
	}

	String info() {
		return super.info()+", 학번 : "+stuID;

	}
}
