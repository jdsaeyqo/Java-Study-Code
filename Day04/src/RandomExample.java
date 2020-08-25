
public class RandomExample {

	public static void main(String[] args) {
		
		//난수 (랜덤값)을 발생시키는 메서드 random()
		//0.0이상 1.0미만의 랜덤 실수값을 가져옴.
		
		double r = Math.random();
		System.out.println(r);
		
		int rn = (int)(r*10);
		System.out.println("정수 난수값: "+rn);
		
		System.out.println("신녕 여행지 선정!");
		if(r > 0.66) {
			System.out.println("모로코");
			
		}else if(r > 0.33) {
			System.out.println("상하이");
		}else {
			System.out.println("집에서 놀자");
		}

	}

}
