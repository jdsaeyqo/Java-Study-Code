
public class BreakEx1 {

	public static void main(String[] args) {
		
		/*
		 * 무한루프
		 * -무한루프는 반복문의 반복횟수를 정확히 모를 때 주로 사용하며
		 * 특정 조건하에서 반복문을 종료시키는 형태로 구성
		 * 
		 * -자바에서 무한루프는 주로 while을 사용하며
		 * while의 조건식 자리에 true를 쓰면 무한루프가 구성
		 */
		int i =0;
		
		while(true) {
			if (i == 15) break;
		//break를 만나면 반복문 강제 종료
			
			
			System.out.println(i);
			i++;
		}
	}

}
