package Baekjoon_9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws IOException {
	
		//어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
		//예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
		//n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		while(n != -1) {
			
			int m = 0;
			String str = n + " = ";
			
			for(int i = 1; i < n; i++) {
				
				if(n % i == 0) {
					m += i;
					str += i;
					
					if(n != m) {
						str += " + ";
					}
				}
			}
			
			if(n == m) {
				System.out.println(str);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
			
			n = Integer.parseInt(br.readLine());
			
		}
	}
}
