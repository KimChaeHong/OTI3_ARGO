package day0619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KCH_2783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double x = Integer.parseInt(st.nextToken());
		double y = Integer.parseInt(st.nextToken());
		double n = Integer.parseInt(br.readLine());
		double prices = (double)x/y*1000;
		
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			double price = (double)(x1*1000)/y1;
			
			 prices=Math.min(price, prices);
			
		}
		
		System.out.println(String.format("%.2f", prices));
		
	}

}
