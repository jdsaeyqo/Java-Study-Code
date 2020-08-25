package this_.car;

public class Car {
	
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}

	void accel(int speed) {
		if (this.speed >= 150) {
			System.out.println("더 이상 속도 올릴 수 없음.");
			
		}
		else {
			this.speed = speed;
		}
	}
	
	void run(int maxSpeed) {
		for(int i = 0; i <=maxSpeed; i+=30) {
			this.accel(i);
			System.out.printf("%s가 달립니다.(시속 : %dkm/h) \n", this.model,this.speed);
		}
	}
}
