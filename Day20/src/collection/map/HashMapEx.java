package collection.map;

import java.util.*;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap();
		
		//map�� ��ü�� ���� put(Key, Value)
		map.put("ġŲ", 20000);
		map.put("���", 2000);
		map.put("����", 30000);
		map.put("���", 3000);  //key������ put�� �̿��ϸ� ����� ��.
		
		System.out.println(map);
		
		//map�� ����� �� Entry��ü �� ��� size()
		System.out.println("map�� ����� �� ��ü �� : "+map.size());
		
		//map�� ����� Value�� ��� get(key)
		Integer price = map.get("����");
		System.out.printf("������ ���� : %d��\n",price);
		
		//map���� key�� ���� �����ϴ� �޼��� keySet()
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("=====================");
		
		while (kIter.hasNext()) {
			String foodName = kIter.next();
			int foodprice = map.get(foodName);
			System.out.println(foodName+"�� ������ "+foodprice+"�Դϴ�");
		}
		
		//map���ο� �ִ� key�� ������ Ȯ���ϴ� �޼��� containsKey()
		String food = "����";
		
		if(map.containsKey(food)) {
			System.out.println(food+"�� ������"+map.get(food));
		}else {
			System.out.println(food+"�� ���� �޴� �Դϴ�");
		}
		
		//map ���� ������ ���� remove(key)
		//�ش� Key�� �����ϴ� Entry��ü�� ����
		map.remove("ġŲ");
		System.out.println(map);
		
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("���� �������");
		}
		else {
			System.out.println("���� ������� ����");
			
		}
	
		
	}

}
