package this_.car;

public class MainClass {

	public static void main(String[] args) {

		Car myCar = new Car("페라리");
		Car yourCar = new Car("아반떼");
		
		myCar.run(250);
		System.out.println("--------------");
		
		yourCar.run(130);
	}

}
