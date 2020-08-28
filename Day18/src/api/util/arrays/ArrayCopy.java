package api.util.arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		char[] arr1 = {'J','A','V','A'};
//		char[] arr2 = new char[4];
//		arr2[0] = arr1[0];
//		arr2[1] = arr1[1];
//		arr2[2] = arr1[2];
//		arr2[3] = arr1[3];
//		
//		arr1[0]='B';\

		char []arr2 = Arrays.copyOf(arr1, arr1.length);
		arr2[2]='Z';
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		char[]arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = {10,20,30,40,50,60,70,80};
		int[] arr5 = Arrays.copyOfRange(arr4, 1, 6);
		System.out.println(Arrays.toString(arr5));
	}

}
