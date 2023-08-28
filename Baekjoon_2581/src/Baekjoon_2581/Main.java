package Baekjoon_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = N;

		for(int i = M; i <= N; i ++) {
			int count = 0;
			
			for(int j = 1; j < i; j ++) {
				if(i % j == 0) count++;
			}
			
			if(count == 1) {
				sum += i;
				if(i < min) min = i;
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);
		}else {
			System.out.println("-1");
		}
	}
}
