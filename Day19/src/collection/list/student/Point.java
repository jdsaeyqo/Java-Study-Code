package collection.list.student;

import java.util.*;

public class Point {

	public static Scanner sc = new Scanner(System.in);

	public static void showPointUI() {
		System.out.println("                  ***성적표***");
		System.out.println("===============================================");
		System.out.println("학번      이름      국어      영어      수학      총점      평균             등급");
		System.out.println("==============================================");
	}

	//성적 입력
	public static void inputPoints(List<Student> students) {
		//학생 객체 1개 생성, 객체 속성값 설정 메서드 호출, 객체 리스트 추가, 저장완료 메시지
		Student stu1 = new Student();		
		stu1.inputStuInfo();
		stu1.calcTotAvgGrade();
		students.add(stu1);
		System.out.println("성적이 저장되었습니다.");


	}
	//모든 성적 보기
	public static void showAllPoints(List<Student> students) {

		//리스트 안에 들어있는 학생 개체들 정보 모두 출력
		//우리반 전체 평균 가장 아랫부분 출력
		double avg=0.0;
		for(Student s : students) {

			s.outputStuInfo();
			avg+=s.getAvg();
		}
		System.out.printf("우리반 전체 평균 : %.2f",avg/students.size());

	}
	//성적 찾기
	public static void searchPoints(List<Student> students) {
		//해당학번과 일치하는 학생객체를 리스트 찾아내서 그 학생 정보만 출력
		//찾는 학번 없을시 검색하지 못했다는 메시지 출력
		System.out.print("조회할 학번 입력 : ");
		String num = sc.next();
		boolean check = false;
		for ( Student s : students) {
			if (num.equals(s.getStuId())) {
				showPointUI();
				s.outputStuInfo();
				check = false;
				break;
			}
			check=true;
		}if (check) {
			System.out.println("해당 학번이 존재하지 않습니다.");
		}

	}
	//성적 수정
	public static void modifyPoints(List<Student> students) {
		System.out.print("수정할 학번 입력 : ");
		String num = sc.next();
		boolean check = false;
		for ( Student s : students) {
			if (num.equals(s.getStuId())) {
				System.out.println("정보를 수정하세요");
				s.inputStuInfo();
				s.calcTotAvgGrade();
				System.out.println("수정이 완료되었습니다");
				check=false;
				break;

			}check = true;
		}if (check) {
			System.out.println("해당 학번이 존재하지 않습니다.");
		}
	}

	//성적 삭제
	public static void deletePoints(List<Student> students) {
		System.out.print("삭제할 학번 입력 : ");
		String num = sc.next();
		boolean check = false;
		for ( Student s : students) {
			if (num.equals(s.getStuId())) {
				System.out.println("정보를 삭제합니다");
				students.remove(s);
				System.out.println("삭제가 완료되었습니다");
				check = false;
				break;
			}check = true;
		}
		if (check) {
			System.out.println("해당 학번이 존재하지 않습니다.");
		}
	}
	//메뉴 정보
	public static void menuInfo() {
		System.out.println("\n ***성적관리 프로그램***");
		System.out.println(" 1. 성적정보 입력");
		System.out.println(" 2. 전체성적 조회");
		System.out.println(" 3. 개별성적 조회");
		System.out.println(" 4. 성적정보 수정");
		System.out.println(" 5. 성적정보 삭제");
		System.out.println(" 6. 프로그램 종료");
		System.out.println("*********************");

	}
}	
