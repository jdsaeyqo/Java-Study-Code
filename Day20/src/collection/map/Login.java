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
			System.out.print("���̵� �Է��ϼ��� : ");
			String id = sc.next();
			
			if (users.containsKey(id)) {
				System.out.print("��й�ȣ�� �Է��ϼ��� : ");
				String pw = sc.next();
				if(pw.equals(users.get(id))) {
					System.out.println("�α��� ���� !");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
				
			}else {
				System.out.println("���̵� �������� �ʽ��ϴ�");
			}
		}
		
		
		
		
		
	}

}
