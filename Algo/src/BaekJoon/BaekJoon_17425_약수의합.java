package BaekJoon;

import java.util.Scanner;

public class BaekJoon_17425_약수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int j = 0; j < t; j++) {

			long n = sc.nextInt();
			long sum = 0;

			for (int i = 1; i <= n; i++) {
				sum += i * (n / i);
			}
			System.out.println(sum);
		}
	}
}