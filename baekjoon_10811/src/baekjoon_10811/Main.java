package baekjoon_10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main (String args[]) throws IOException{
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// N==바구니, M==뒤집을 횟수 받기
		int[] N = new int[Integer.parseInt(st.nextToken())+1];
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=1 ; i<N.length ; i++) {
			N[i] = i;
		}
		
		
		// 바구니 순서를 뒤집을 순번 i, j 받기
		for(int m=0 ; m<M ; m++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			double I = (double)i;
			double J = (double)j;
			
			// i,j로 뒤집어야 할 횟수를 계산해서 바구니 뒤집기
			for(int r=0; r<Math.ceil((J-I)/2) ; r++) {
				
				int temp = N[i];
				N[i] = N[j];
				N[j] = temp;
				i++;
				j--;
				
			}
		}

		// 뒤집힌 순번으로 출력
		for(int s=1 ; s<N.length ; s++)
			System.out.print(N[s]+ " ");
		
	}
}

