package Baekjoon_2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException {
	
		// 첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 
		// 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(str.nextToken());
		int K = Integer.parseInt(str.nextToken());
		int index = 1;
		
		int[] arr = new int[K + 1];
		
		for(int i = 1; i <= N; i++) {
			if(index > K) break;
			if(N % i == 0) {
				arr[index] = i;
				index++;
			}
		}
		
		System.out.println(arr[K]);
		
	}
}
