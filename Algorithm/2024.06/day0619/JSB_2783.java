package day0619;

import java.io.*;
import java.util.*;

public class JSB_2783 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double x = Integer.parseInt(st.nextToken());
		double y = Integer.parseInt(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		double min = (1000/y)*x;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			double a = Integer.parseInt(st.nextToken());
			double b = Integer.parseInt(st.nextToken());
			min = Math.min(min,(1000/b)*a);
		}
		
		System.out.println(String.format("%.2f",min));
	}

}
