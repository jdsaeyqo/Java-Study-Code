package str_equals;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		 * String 객체를 생성할 시 같은 주소값을 공유하게 됨.
		 */
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1==s2);
		
		Scanner sc = new Scanner(System.in);
		
		User u = new User("abc1234");
		
		System.out.print("비밀번호 입력 : ");
		String password = sc.next();
		
		
		if(password.equals(u.pw)) {
			System.out.println("비밀번호가 일치");
		}
		else {
			System.out.println("일치하지 않습니다");
		}

	}

}
