package day0617;

import java.util.Scanner;

public class YJY_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			int[][] residents = new int[k + 1][n + 1];

			for (int i = 1; i <= n; i++) {
				residents[0][i] = i;
			}

			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					residents[i][j] = residents[i][j - 1] + residents[i - 1][j];
				}
			}

			System.out.println(residents[k][n]);
		}

		sc.close();
	}
}
