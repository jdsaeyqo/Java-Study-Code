
public class PrimeNum {

	public static void main(String[] args) {
		
		
		
		
		
		// i  cnt  j 
		// 1   0   2
		
		
		for (int i =1; i<=100; i++) {
			int cnt = 0;
			
			for ( int j = 1; j<=i; j++){
				
				if (i % j == 0) {
					cnt++;
					
				}
			}
			if (cnt==2) {
				System.out.print(i+" ");
			}
			
		}

	}

}
