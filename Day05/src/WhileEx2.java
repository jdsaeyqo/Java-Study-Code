import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력하세요 : " );
		int num = scan.nextInt();
		
		int n = 2;
		
		while (num % n !=0) {
			n++;}
		
		if (num == n) {
				System.out.println("소수");
			}
		else {
				System.out.println("소수 아님");
			}
		}

	}


