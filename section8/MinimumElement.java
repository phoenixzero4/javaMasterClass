package section8;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
	static Scanner in;

	private static int readInteger() {
		in = new Scanner(System.in);
		final int x = in.nextInt();
		return x;
	}

	private static int[] readElements(final int param) {
		in = new Scanner(System.in);
		final int[] array = new int[param];
		for (int i = 0; i < param; i++) {
			array[i] = in.nextInt();
		}
		return array;
	}

	private static int findMin(final int[] array) {
		Arrays.sort(array);
		return array[0];
	}
}
