package inherit.goodcase;

public class MainClass {

	public static void main(String[] args) {
		
		Person lee = new Person();
		lee.name = "홍길동";
		lee.age = 45;
		lee.gender = "남자";
		System.out.println(lee.info());
		
		Student park = new Student();
		park.stuID = "2014302033";
		park.name = "이순신";
		park.age = 23;
		park.gender = "남자";

		System.out.println(park.info());
		
		Teacher kang = new Teacher();
		kang.subject = "수학";
		kang.name = "강감찬";
		kang.age = 41;
		kang.gender = "남자";

		System.out.println(kang.info());
		
		Employee shin = new Employee();
		shin.department = "구매부";
		shin.name=  "신사임당";
		shin.age = 40;
		shin.gender = "여자";
		
		

		System.out.println(shin.info());
		
		

	}

}
