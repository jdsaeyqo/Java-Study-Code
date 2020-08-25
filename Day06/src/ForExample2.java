
public class ForExample2 {

	public static void main(String[] args) {


		//7~100까지의 정수 중 7의 배수를 모두 가로로 출력
		
		for ( int i= 7; i <=100; i+=7) {
			System.out.print(i+ " ");
		}
			System.out.println("\n----------------");
			
			for (int i=1; i <=100; i++) {
				if( i % 6 == 0) {
					System.out.print(i+" ");
				}
				
			}
	}

}
