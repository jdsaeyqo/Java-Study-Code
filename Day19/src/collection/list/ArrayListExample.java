package collection.list;

import java.util.*;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//ArrayList 객체 생성.
		//제네릭(generic) : 타입의 안정화를 위해 객체 내부에 저장되는 타입 일치시킴
		List<String> list = new ArrayList<>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		System.out.println(list);
		
		//list에 객체를 저장하는 메서드 add() : 데이터 맨 끝에 추가
		list.add(str1);
		list.add(str2);
		list.add("Database");
		list.add("JDBC");
		list.add("JSP"); //list는 객체의 중복 저장을 허용
		
		System.out.println(list);
		
		//list에 저장된 총 객체 수 얻기 size()
		int size = list.size();
		System.out.println(size);
		
		//list에 객체 삽입 add(index,객체) : 데이터를 해당 인덱스에 삽입
		list.add(2,"Oracle");
		System.out.println(list);
		
		//list 데이터 수정 set(index,객체)
		list.set(3, "MySQL");
		System.out.println(list);
		
		//list 내부 객체 가져오기 get(index)
		String s = list.get(2);
		System.out.println(s);
		
		//list 에 저장된 객체의 인덱스 번호 확인하기 indexOf(객체)
		int idx = list.indexOf("MySQL");
		System.out.println(idx);
		
		//indexOf는 객체를 검색하지 못했을 경우 -1을 리턴.
		idx = list.indexOf("안녕~~");
		System.out.println(idx);
		
		//list에서 객체데이터 삭제 remove(index), remove(obj)
		list.remove(5);
		System.out.println(list);
		
		list.remove(str1);
		System.out.println(list);
		
		//list 내부에 저장된 객체의 유무확인 contains()
		System.out.println(list.contains("JSP"));
		
		//list의 반복문 처리
		System.out.println("=====================");
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		
		}
		
		System.out.println("=====================");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("=====================");

		//list 내부 객체 전체 삭제 clear()
		list.clear();
		System.out.println(list);
		
		//list내부 데이터가 전부 비어있는지 확인하는 메서드 isEmpty()
		if(list.isEmpty()) {
			System.out.println("list가 비어있음");
		}else {
			System.out.println("list가 비어있지 않음.");
		}
		
	}
	

}
