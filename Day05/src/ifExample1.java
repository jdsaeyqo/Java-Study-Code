
public class ifExample1 {

	public static void main(String[] args) {
		
		// 0 ~ 100 까지의 정수형 난수 발생.
		int point = (int)(Math.random()*101);
	   System.out.println("점수 : "+point);
	   
	   if (point >=60) {
		   System.out.println("통과입니다");
	   }else {
		   System.out.println("불합격입니다");
	   }
	   System.out.println("수고하셨습니다");

	}//end main

}//end class
