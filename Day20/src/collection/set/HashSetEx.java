package collection.set;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {


		//set�� �ߺ� ���x
		//���� ���� ����x

		Set<String> set = new HashSet<>();
		//set�� ��ü�� �߰� add()
		set.add("�߰���");
		set.add("���");
		set.add("�踻��");
		set.add("�ܹ���");
		set.add("���");

		//set�� ����� ��ü �� �˾ƺ��� �޼���  size()
		System.out.println("set�� ����� ��ü �� : "+set.size());
		System.out.println(set);

		/*
		 * set�� ��ü�����͸� ����Ϸ��� �ݺ���(Iterator)�� ���� ��� ��ü�� �������
		 * �ѹ��� �ݺ��ؼ� ������ ��.
		 */
		Iterator<String> iter = set.iterator();

		/*
		 * �ݺ��� ��ü�� next()�޼��带 ���� set ������ �����͸� �ݺ������� ��
		 * �� �̻� ��ȸ�� �����Ͱ� ������ ���ܸ� �߻���Ű�� ������ hasNext()�� ����
		 * �� �̻� �Ҹ��� �����Ͱ� �ִ����� ������ üũ�մϴ�.
		 */

		while(iter.hasNext()){
			String s =iter.next();
			if(s.equals("�߰���")) {
				System.out.println(s+"�� ���־�");
				break;
			}
		}
		
		//set�� ������ ���� ��� remove(),clear()
		set.remove("�ܹ���");
		System.out.println(set);
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("set�� �������");
		}else {
			System.out.println("set�� ������� ����");
		}
	}

}
