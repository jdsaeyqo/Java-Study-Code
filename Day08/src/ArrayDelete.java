import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] iArr = {1,3,5,7,9,11,13};
		System.out.println(Arrays.toString(iArr));
		
		for (int i =1; i < iArr.length - 1; i++) {
			iArr[i] = iArr[i+1];
		}
		
		/*
		 * iArr[2] = iArr[3];
		 
		iArr[3] = iArr[4];
		iArr[4] = iArr[5];
		iArr[5] = iArr[6];
		System.out.println(Arrays.toString(iArr));
		*/

		

	}

}
