package baekjoon_11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException {
		
		//N×N개의 수가 N×N 크기의 표에 채워져 있다. (x1, y1)부터 (x2, y2)까지 합을 구하는 프로그램을 작성하시오. (x, y)는 x행 y열을 의미한다.
		//예를 들어, N = 4이고, 표가 아래와 같이 채워져 있는 경우를 살펴보자.
		// 1	2	3	4
		// 2	3	4	5
		// 3	4	5	6
		// 4	5	6	7
		//여기서 (2, 2)부터 (3, 4)까지 합을 구하면 3+4+5+4+5+6 = 27이고, (4, 4)부터 (4, 4)까지 합을 구하면 7이다.
		//표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때, 이를 처리하는 프로그램을 작성하시오.
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 배열크기, 질의갯수 받기
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 배열 생성
		int A[][] = new int[N+1][N+1];
		
		for(int i=1 ; i<=N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1 ; j<=N ; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 합배열 생성
		int D[][] = new int[N+1][N+1];
		
		for(int i=1 ; i<=N ; i++) {
			for(int j=1 ; j<=N ; j++) {
				
				// 합배열 생성 공식
				D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + A[i][j];
			}
		}	
		
		// 질의갯수만큼 출력
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			// 구간합 출력 공식
			int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
			System.out.println(result);
		}
	}
}
