package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		Random r = new Random();

		int[] lotto = new int[6];


		for(int i = 0; i<6;i++) {
			int r1 = r.nextInt(45) +1;
			lotto[i]=r1;
		}

		Arrays.sort(lotto);
		for(int i = 0; i<6;i++) {
			System.out.print(lotto[i]+" ");



		}

	}
}