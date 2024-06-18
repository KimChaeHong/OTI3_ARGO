package day0618;

import java.io.*;
import java.util.*;

public class JSB_2798 {
	static int[] arr;
	static int[] three;
	static int n,m;
	static int max=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		n =  Integer.parseInt(st.nextToken());
		m =  Integer.parseInt(st.nextToken());
		 arr = new int[n];
		 three = new int[3];
		  st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		card(0,0);
		
		System.out.println(max);
	}

	private static void card(int cnt, int start) {
		if(cnt==3) {
			int sum=0;
				
			for(int i=0;i<3;i++) {
				sum+=three[i];	
			}
			if(sum<=m) {
				max= Math.max(sum,max);
			}
			return ;
		}
		for(int i=start;i<n;i++) {
			three[cnt] = arr[i];
			card(cnt+1,i+1);
		}
	}

}
