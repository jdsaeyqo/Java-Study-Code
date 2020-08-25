import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 5;
		

		while(true) {

			System.out.println("------------");
			System.out.print("돈을 넣어 주세요 : ");
			int coin = sc.nextInt();



			if (coin > 500) {
				cnt--;
				System.out.println("음료수를 받았습니다");
				System.out.println("거스름돈 "+(coin-500)+"원을 받으세요");
				System.out.println("남은 음료수의 갯수는 "+cnt+"개 입니다");
			}
			else if (coin == 500) {
				cnt--;
				System.out.println("음료수를 받았습니다");
				System.out.println("남은 음료수의 갯수는 "+cnt+"개 입니다");
			}
			else {
				System.out.println("돈이 부족합니다");
				System.out.println("최소 500원을 넣어주세요");
			}


			if (cnt ==0 ) {
				System.out.println("음료수가 다 떨어졌습니다. 판매를 중지합니다.");
				break;

			}
		}
	}
}















