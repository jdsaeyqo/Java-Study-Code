package super_.person;

public class MainClass {

	public static void main(String[] args) {

		Student lee = new Student("이상욱",26,"34");
		System.out.println(lee.info());
		
		Teacher lim = new Teacher("임창정", 50, "음악");
		System.out.println(lim.info());
		
		Student noname = new Student();
			
	}

}
