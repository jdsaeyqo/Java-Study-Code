package collection.list.student;

import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> stuList= new ArrayList<>();

		while(true) {

			Point.menuInfo();
			System.out.print("메뉴 입력 : ");
			int num = sc.nextInt();
			
			if (num == 1) {				
				Point.inputPoints(stuList);								
			}else if (num == 2) {
				Point.showPointUI();
				Point.showAllPoints(stuList);
				
			}else if (num == 3) {
				Point.searchPoints(stuList);
				
			}else if (num == 4) {
				Point.modifyPoints(stuList);
				
			}else if (num == 5) {
				Point.deletePoints(stuList);
				
			}else if (num == 6) {
				System.out.println("프로그램을 종료합니다");
				break;
				
				
			}else {
				System.out.println("메뉴를 잘못 입력하였습니다.");
			}
		}
	}

}
