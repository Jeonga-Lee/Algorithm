package Baekjoon_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException {
	
		// N개 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 숫자 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int primeNo = 0;
		
		// 소수인지 확인하기
		for(int i = 0; i < N; i++) {
			
			int no = Integer.parseInt(st.nextToken());
			int count = 0;
			
			for(int j = 1; j <no ; j++) {
				if(no % j == 0) count++;
			}

			// 소수가 맞으면 카운트 추가
			if(count == 1) primeNo++;
		}
		// 출력
		System.out.println(primeNo);
	}
}
