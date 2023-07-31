package baekjoon_10813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main (String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 바구니 N 개, 횟수 M  입력 받기
		int[] N = new int[Integer.parseInt(st.nextToken())+1];
		
		for(int i=0 ; i<N.length ; i++) {
			N[i] = i;
		}
		
		int M = Integer.parseInt(st.nextToken());
		
		// 횟수 만큼 i, j 입력 받기
		// i와 j 교환하기
		for(int m=0 ; m<M ; m++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int t = N[i];
			N[i] = N[j];
			N[j] = t;
		}

		// 1번 바구니부터 N번 바구니까지 공의 번호 공백으로 구분해 출력
		for(int i=1 ; i<N.length ; i++) {
			System.out.print(N[i]+" ");
		}	
	}
}