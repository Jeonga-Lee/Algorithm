package Baekjoon_2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException {
	
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] C = new int[N][M];
		
		// 행렬 A 
		for(int i = 0; i < N; i ++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < M; j ++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 행렬 B
		for(int i = 0; i < N; i ++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < M; j ++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 행렬 A + B 더하기
		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < M; j ++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		// 출력
		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < M; j ++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}
