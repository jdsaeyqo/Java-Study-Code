import java.util.Scanner;

public class BreakEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println();

		while(true) {
			System.out.println(" 15 x 6 = ? ");
			System.out.print("> ");
			int answer = sc.nextInt();

			if(answer == 90) {
				System.out.println("정답입니다!"); break;
			}else {
				System.out.println("오답입니다");
			}
			

		}sc.close();

	}
}
