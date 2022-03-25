package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_15657_S3_N과M8 {
	static int all;
	static int pick;
	static int[] result;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		all = sc.nextInt();
		pick = sc.nextInt();
		arr = new int[all];
		result = new int[pick];
		for (int i = 0; i < all; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		recur(0);

	}

	public static void recur(int dept) {
		// 끝내
		if (dept >= pick) {
			for (int i = 0; i < pick; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}

		// 재귀
		for (int i = 0; i < all; i++) {
			if(dept!=0&&result[dept-1]>arr[i]) continue;
			else {
				result[dept] = arr[i];
				recur(dept + 1);
			}
		}
	}
}
