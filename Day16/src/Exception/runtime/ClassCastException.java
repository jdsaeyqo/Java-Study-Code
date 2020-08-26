package Exception.runtime;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastException {

	public static void main(String[] args) {
		
		//Dog와 Animal은 상속관계라 형변환 자유
		Dog d = new Dog();
		Animal da = d;
		d=(Dog)da;
		System.out.println("타입 변환 성공! Animal -> Dog");
		
		Animal c = new Cat();
		Dog d2=(Dog)c;
		System.out.println("타입 변환 성공!Cat -> Dog");

	}

}
