package poly.person;

public class MainClass {

	public static void main(String[] args) {

		Person hong = new Student("홍길동",15,"32");
		Person lee = new Student("이순신",17,"21");
		Person park = new Student("박찬호",13,"61");
		
		Person kim = new Teacher("김철수", 26, "영어");
		Person song = new Teacher("송영희", 29, "수학");
		
		Person lim = new Employee("임꺽정",45,"행정");
		
		Person[] people = {hong, lee, park, kim, song, lim};
		
		for(Person p : people) {
			System.out.println(p.info());
		}
		
//		Student[] students = {hong,lee,park};
//		Teacher [] teachers = {kim,song};
//		Employee[] employees = {lim};
//		
//		for (int  i = 0; i < students.length;i++) {
//			System.out.println(students[i].info());
//		}
		
				
	}

}
