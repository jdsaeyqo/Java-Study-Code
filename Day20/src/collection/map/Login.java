package collection.map;

import java.util.*;

public class Login {

	public static void main(String[] args) {

		Map<String, String> users = new HashMap();
		
		users.put("kim1234", "kkk1234");
		users.put("lee5678", "lll5678");
		users.put("park9876", "ppp9876");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();
			
			if (users.containsKey(id)) {
				System.out.print("비밀번호를 입력하세요 : ");
				String pw = sc.next();
				if(pw.equals(users.get(id))) {
					System.out.println("로그인 성공 !");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
				
			}else {
				System.out.println("아이디가 존재하지 않습니다");
			}
		}
		
		
		
		
		
	}

}
