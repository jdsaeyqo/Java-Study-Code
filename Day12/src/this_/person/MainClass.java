package this_.person;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수", 25);
		
		Person park = new Person("박영희");
		System.out.println(park.info());
		
		Person noname = new Person();
		System.out.println(noname.info());
				

	}

}
