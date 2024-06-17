package day0617;

public class KCH_2775 {

	public static void main(String[] args) {
		int [][] arr = new int[15][15];
		
		for (int i = 0; i < 15; i++) {
			arr[0][i] = i;
		}
		
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
			}
		}

	}

}
