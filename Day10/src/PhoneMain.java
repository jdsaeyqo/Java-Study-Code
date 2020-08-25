
public class PhoneMain {

	public static void main(String[] args) {
		
		//생성자는 객체 생성할 때 1회 호출훌 수 있음.
		Phone basic = new Phone();
		basic.info();
		
		Phone bluePhone = new Phone("사파이어");
		bluePhone.info();
		
		Phone galaxyS9=new Phone("코발트 블루", "갤럭시S9");
		galaxyS9.info();
		
		Phone Shaomi = new Phone("빨강","샤오미",600000);
		Shaomi.info();
				
		
		

	}

}
