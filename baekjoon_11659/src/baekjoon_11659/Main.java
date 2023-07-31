package baekjoon_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 데이터의 개수, 질의 개수 받기
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		
		// 구간 합을 구할 대상 배열 받기
		long[] S = new long[suNo + 1];
		
		st = new StringTokenizer(br.readLine());
		// 합배열 생성
		for(int i=1 ; i<=suNo ; i++) {
			S[i] = S[i-1] +  Integer.parseInt(st.nextToken());
		}
		
		// 질의를 받고 합배열을 바로 출력
		for(int q=1 ; q<=quizNo ; q++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			System.out.println(S[j] - S[i-1]);
		}
	}
}
