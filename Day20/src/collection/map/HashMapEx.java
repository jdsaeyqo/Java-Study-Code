package collection.map;

import java.util.*;

public class HashMapEx {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap();
		
		//map에 객체를 저장 put(Key, Value)
		map.put("치킨", 20000);
		map.put("라면", 2000);
		map.put("족발", 30000);
		map.put("라면", 3000);  //key같으면 put을 이용하면 덮어쓰기 됨.
		
		System.out.println(map);
		
		//map에 저장된 총 Entry객체 수 얻기 size()
		System.out.println("map에 저장된 총 객체 수 : "+map.size());
		
		//map에 저장된 Value값 얻기 get(key)
		Integer price = map.get("족발");
		System.out.printf("족발의 가격 : %d원\n",price);
		
		//map에서 key를 전부 추출하는 메서드 keySet()
		Set<String> kSet = map.keySet();
		System.out.println(kSet);
		
		Iterator<String> kIter = kSet.iterator();
		System.out.println("=====================");
		
		while (kIter.hasNext()) {
			String foodName = kIter.next();
			int foodprice = map.get(foodName);
			System.out.println(foodName+"의 가격은 "+foodprice+"입니다");
		}
		
		//map내부에 있는 key의 유무를 확인하는 메서드 containsKey()
		String food = "피자";
		
		if(map.containsKey(food)) {
			System.out.println(food+"의 가격은"+map.get(food));
		}else {
			System.out.println(food+"는 없는 메뉴 입니다");
		}
		
		//map 내부 데이터 삭제 remove(key)
		//해당 Key에 대응하는 Entry객체를 삭제
		map.remove("치킨");
		System.out.println(map);
		
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("맵이 비어있음");
		}
		else {
			System.out.println("맵이 비어있지 않음");
			
		}
	
		
	}

}
