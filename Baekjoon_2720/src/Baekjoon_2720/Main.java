package Baekjoon_2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int Q; // 쿼터
		int D; // 다임
		int N; // 니켈
		int P; // 페니
		int C; // 거스름돈
		
		for(int i = 0; i < T; i++) {

			Q = 0; // 쿼터
				D = 0; // 다임
				N = 0; // 니켈
				P = 0; // 페니
			
				C = Integer.parseInt(br.readLine());
				
				Q = C/25;
				C = C - (Q * 25);
				
				D = C/10;
				C = C - (D * 10);
				
				N = C/5;
				C = C - (N * 5);
				
				P = C/1;
				C = C - (P * 1);
			
				System.out.println(Q + " " + D + " " + N + " " + P);
		}
	}
}
