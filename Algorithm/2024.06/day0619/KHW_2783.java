package day0619;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KHW_2783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double x = Double.parseDouble(st.nextToken()); // 원
        double y = Double.parseDouble(st.nextToken()); // 그램
        int n = Integer.parseInt(br.readLine()); // 편의점 수
        double min = (1000 * x) / y; // 최저가
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            double tx = Double.parseDouble(st.nextToken());
            double ty = Double.parseDouble(st.nextToken());
            min = Math.min(min, (1000 * tx) / ty);
        }
        
        System.out.println(min);
    }
}