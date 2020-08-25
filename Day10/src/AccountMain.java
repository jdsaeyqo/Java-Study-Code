import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);



		System.out.println("계좌를 등록합니다");
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("비밀번호 : ");
		int password=sc.nextInt();
		System.out.print("입금액 : ");
		int balance=sc.nextInt();

		Account Acc1 = new Account(name,password,balance); 

		while (true) {
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 예금  / 2. 출금 / 3. 잔액조회 / 4. 종료");
			System.out.print("->");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("계좌 비밀번호를 입력하세요");
				System.out.print("->");
				int pw = sc.nextInt();
				if (pw==Acc1.password) {
					System.out.print("입금할 금액 입력하세요 : ");
					int input =sc.nextInt();
					Acc1.deposit(input);
					System.out.println("입금이 완료되었습니다.");


				}
				else {System.out.println("비밀번호가 잘못되었습니다");
				}
			}

			else if (menu == 2) {
				System.out.println("계좌 비밀번호를 입력하세요");
				System.out.print("->");
				int pw = sc.nextInt();
				if (pw==Acc1.password) {
					System.out.print("출금할 금액 입력하세요 : ");
					int output =sc.nextInt();
					if ((Acc1.balance -output) < 0) {
						System.out.println("잔액이 부족합니다");
					}
					else {
						Acc1.withDraw(output);
						System.out.println("출금이 완료되었습니다.");
					}

				}
				else {System.out.println("비밀번호가 잘못되었습니다");
				}
			}
			else if (menu ==3) {
				System.out.println("계좌 비밀번호를 입력하세요");
				System.out.print("->");
				int pw = sc.nextInt();
				if (pw==Acc1.password) {
					int bal = Acc1.getBalance();	
					System.out.println("계좌 잔액 : "+bal);
				}
				else {System.out.println("비밀번호가 잘못되었습니다");
				}
			}
			else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}






		}
		sc.close();
		


	}
}