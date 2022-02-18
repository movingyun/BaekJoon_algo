package SWEA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_2817_부분수열의합 {
	static List<Integer> arr = new ArrayList<Integer>();
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			cnt=0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int i = 0; i < a; i++) {
				arr.add(sc.nextInt());
			}
			recur(a, b, 0, 0);
			System.out.println("#"+tc+" "+cnt);
			arr.clear();
		}
	}

	static void recur(int a, int b, int n, int sum) {
		// 이제 그만 두는 파트
		if (n == a) {
			if (sum == b)
				cnt++;
			return;
		}
		recur(a, b, n + 1, sum + arr.get(n));
		recur(a, b, n + 1, sum);
	}
}