package collection.list;

import java.util.*;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//ArrayList ��ü ����.
		//���׸�(generic) : Ÿ���� ����ȭ�� ���� ��ü ���ο� ����Ǵ� Ÿ�� ��ġ��Ŵ
		List<String> list = new ArrayList<>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		System.out.println(list);
		
		//list�� ��ü�� �����ϴ� �޼��� add() : ������ �� ���� �߰�
		list.add(str1);
		list.add(str2);
		list.add("Database");
		list.add("JDBC");
		list.add("JSP"); //list�� ��ü�� �ߺ� ������ ���
		
		System.out.println(list);
		
		//list�� ����� �� ��ü �� ��� size()
		int size = list.size();
		System.out.println(size);
		
		//list�� ��ü ���� add(index,��ü) : �����͸� �ش� �ε����� ����
		list.add(2,"Oracle");
		System.out.println(list);
		
		//list ������ ���� set(index,��ü)
		list.set(3, "MySQL");
		System.out.println(list);
		
		//list ���� ��ü �������� get(index)
		String s = list.get(2);
		System.out.println(s);
		
		//list �� ����� ��ü�� �ε��� ��ȣ Ȯ���ϱ� indexOf(��ü)
		int idx = list.indexOf("MySQL");
		System.out.println(idx);
		
		//indexOf�� ��ü�� �˻����� ������ ��� -1�� ����.
		idx = list.indexOf("�ȳ�~~");
		System.out.println(idx);
		
		//list���� ��ü������ ���� remove(index), remove(obj)
		list.remove(5);
		System.out.println(list);
		
		list.remove(str1);
		System.out.println(list);
		
		//list ���ο� ����� ��ü�� ����Ȯ�� contains()
		System.out.println(list.contains("JSP"));
		
		//list�� �ݺ��� ó��
		System.out.println("=====================");
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		
		}
		
		System.out.println("=====================");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("=====================");

		//list ���� ��ü ��ü ���� clear()
		list.clear();
		System.out.println(list);
		
		//list���� �����Ͱ� ���� ����ִ��� Ȯ���ϴ� �޼��� isEmpty()
		if(list.isEmpty()) {
			System.out.println("list�� �������");
		}else {
			System.out.println("list�� ������� ����.");
		}
		
	}
	

}
