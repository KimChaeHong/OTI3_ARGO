package day0620;

import java.util.Scanner;

public class YJY_2783 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double X = scanner.nextDouble();
		double Y = scanner.nextDouble();

		double minPrice = (X / Y) * 1000;

		int N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			double Xi = scanner.nextDouble();
			double Yi = scanner.nextDouble();

			double price = (Xi / Yi) * 1000;

			if (price < minPrice) {
				minPrice = price;
			}
		}

		System.out.printf("%.2f\n", minPrice);

		scanner.close();
	}
}
