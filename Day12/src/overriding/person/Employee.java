package overriding.person;

public class Employee extends Person {
	
	String department;

	String info() {
		return "이름: " + name + ", 나이 : "+age+", 성별 : "+gender+", 부서 : "+department
				;
	

	}
}
