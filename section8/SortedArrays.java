package section8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import java.util.*;

public class SortedArrays {
	public static Scanner in;
	public static int[] array;
	public static int[] array2;

	public static int[] getIntegers(int x) {
		in = new Scanner(System.in);
		int[] array = new int[x];
		for (int i = 0; i < x; i++) {
			array[i] = in.nextInt();
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		Arrays.sort(array);
		int[] array2 = new int[array.length];
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			array2[j] = array[i];
		}
		return array2;
	}
}
