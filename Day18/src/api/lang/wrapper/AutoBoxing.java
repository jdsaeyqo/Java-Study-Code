package api.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {

		//AutoBoxing : 기본타입 데이터를 자동으로 객체로 변환.
		
		int a = 100;
		Integer val1 = a;
		Double val2 = 3.1415;
		
		Object[] arr = {56, 3.1415,"안녕",99,200.12};
		
		//AutoUnBoxing
		int x = val1;
		double y = val2 + 5.3;
		
		//Parsing : 문자열 데이터를 기본타입으로 변환
		String s1 = "10";
		String s2 = "5.43";
		int i = Integer.parseInt(s1);
		double j = Double.parseDouble(s2);
		boolean k = Boolean.parseBoolean("true");
		
		System.out.println(i*j);
		
	}

}
