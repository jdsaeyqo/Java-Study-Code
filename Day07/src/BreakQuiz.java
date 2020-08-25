import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt =0;
		int cnt1=0;

		while(true) {
			
			
			int num1 = (int)(Math.random()*100+1);
			int num2 = (int)(Math.random()*100+1);

			System.out.println(num1+" + "+num2+" = ? ");
			System.out.println("그만 푸시려면 0을 누르세요");
			System.out.print("정답 : ");
			int answer = sc.nextInt();
			
			

			if (answer == num1 + num2 ) {
				System.out.println("정답입니다");
				cnt++;
			}
			else if (answer == 0) {
				System.out.println("프로그램을 종료합니다");
				System.out.println("정답횟수 : "+cnt+"회");
				System.out.println("틀린횟수 : "+cnt1+"회");
				break;
			}
			else {
				System.out.println("오답입니다");
				cnt1++;
			
			}

		}
	}
}