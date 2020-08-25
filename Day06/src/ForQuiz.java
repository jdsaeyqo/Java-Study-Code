import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단 수 입력 : ");
		int num = scan.nextInt();
		
		
		System.out.println("구구단 "+num+"단");
		System.out.println("-------------");
		for(int i =1; i <=9; i++) {
			
			System.out.println(num+" x "+i+" = "+num*i);
			
	
		}scan.close();
		
		

	}

}
