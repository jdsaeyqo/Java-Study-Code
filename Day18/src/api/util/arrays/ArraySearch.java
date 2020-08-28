package api.util.arrays;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {

		int[] scores = {75,47,23,56,89};
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		
		Arrays.sort(scores2);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores2));
		
		//배열 내부데이터의 인덱스번호를 탐색하는 메서드 binarySearch()
		int index = Arrays.binarySearch(scores2, 75);
		System.out.println("75가 저장된 인덱스 : " + index);
		
		//배열 비교 equals(배열1, 배열2)
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {1,3,5,7,9};
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("배열의 각 항목 일치");
		}else {
			System.out.println("배열의 각 항목 불일치");
		}
		
	}

}
