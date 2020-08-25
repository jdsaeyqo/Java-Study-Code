
public class EnhancedForLoop {
	
	public static void main(String[] args) {
		
		String[] weekDay = {"일","월","화","수","목","금","토"};
		
		
		for(String day:weekDay) {
			System.out.println(day+"요일");
		}
//		for (int i = 0; i < weekDay.length; i++) {
//			System.out.println(weekDay[i]+"요일");
		
		
//		}
		System.out.println();
		int[] scores = {98, 71, 85, 67, 100, 95};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int score: scores) {
			
			sum += score;
			
		}
		avg = (double)sum / scores.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		
	}


}
