package collection.list.student;

import java.util.*;

public class Point {

	public static Scanner sc = new Scanner(System.in);

	public static void showPointUI() {
		System.out.println("                  ***����ǥ***");
		System.out.println("===============================================");
		System.out.println("�й�      �̸�      ����      ����      ����      ����      ���             ���");
		System.out.println("==============================================");
	}

	//���� �Է�
	public static void inputPoints(List<Student> students) {
		//�л� ��ü 1�� ����, ��ü �Ӽ��� ���� �޼��� ȣ��, ��ü ����Ʈ �߰�, ����Ϸ� �޽���
		Student stu1 = new Student();		
		stu1.inputStuInfo();
		stu1.calcTotAvgGrade();
		students.add(stu1);
		System.out.println("������ ����Ǿ����ϴ�.");


	}
	//��� ���� ����
	public static void showAllPoints(List<Student> students) {

		//����Ʈ �ȿ� ����ִ� �л� ��ü�� ���� ��� ���
		//�츮�� ��ü ��� ���� �Ʒ��κ� ���
		double avg=0.0;
		for(Student s : students) {

			s.outputStuInfo();
			avg+=s.getAvg();
		}
		System.out.printf("�츮�� ��ü ��� : %.2f",avg/students.size());

	}
	//���� ã��
	public static void searchPoints(List<Student> students) {
		//�ش��й��� ��ġ�ϴ� �л���ü�� ����Ʈ ã�Ƴ��� �� �л� ������ ���
		//ã�� �й� ������ �˻����� ���ߴٴ� �޽��� ���
		System.out.print("��ȸ�� �й� �Է� : ");
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
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}

	}
	//���� ����
	public static void modifyPoints(List<Student> students) {
		System.out.print("������ �й� �Է� : ");
		String num = sc.next();
		boolean check = false;
		for ( Student s : students) {
			if (num.equals(s.getStuId())) {
				System.out.println("������ �����ϼ���");
				s.inputStuInfo();
				s.calcTotAvgGrade();
				System.out.println("������ �Ϸ�Ǿ����ϴ�");
				check=false;
				break;

			}check = true;
		}if (check) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}
	}

	//���� ����
	public static void deletePoints(List<Student> students) {
		System.out.print("������ �й� �Է� : ");
		String num = sc.next();
		boolean check = false;
		for ( Student s : students) {
			if (num.equals(s.getStuId())) {
				System.out.println("������ �����մϴ�");
				students.remove(s);
				System.out.println("������ �Ϸ�Ǿ����ϴ�");
				check = false;
				break;
			}check = true;
		}
		if (check) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}
	}
	//�޴� ����
	public static void menuInfo() {
		System.out.println("\n ***�������� ���α׷�***");
		System.out.println(" 1. �������� �Է�");
		System.out.println(" 2. ��ü���� ��ȸ");
		System.out.println(" 3. �������� ��ȸ");
		System.out.println(" 4. �������� ����");
		System.out.println(" 5. �������� ����");
		System.out.println(" 6. ���α׷� ����");
		System.out.println("*********************");

	}
}	
