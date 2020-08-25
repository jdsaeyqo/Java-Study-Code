package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		DmbPhone dp = new DmbPhone("햅틱", "메탈크레이",10);
		
		System.out.println("모델 : "+dp.model);
		System.out.println("색상 : "+dp.color);
		System.out.println("채널 : "+dp.channel);
		
		dp.powerOn();
		dp.ring();
		dp.hangUp();
		
		dp.turnOnDmb();
		dp.changeChannel(7);
		dp.turnOffDmb();
		dp.powerOff();

	}

}
