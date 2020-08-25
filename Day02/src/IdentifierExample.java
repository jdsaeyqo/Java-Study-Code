
public class IdentifierExample {

	public static void main(String[] args) {
		
		//자바의 식별자 이름은 대소문자 구분함
		int age = 20;
		int aGe = 21;
		int aGE = 22;
		
		System.out.println(age);
		System.out.println(aGe);
		
		//식별자 이름을 숫자로 시작하게 만들지 마세요
		int number4 = 4;
		int num4ber = 4;
		// int 4number = 4;  (X)
		
		//식별자 이름에 공백 포함 x
//		int birth day= 020111; (x) 
		int birthDay = 950808;
		

	}

}
