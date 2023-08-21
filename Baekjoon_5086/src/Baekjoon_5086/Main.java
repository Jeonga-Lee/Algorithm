package Baekjoon_5086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main (String args[]) throws IOException {
	
		// 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");

		int no1 = Integer.parseInt(str.nextToken());
		int no2 = Integer.parseInt(str.nextToken());
		
		while(no1 != 0 && no2 != 0) {
			
			if(no2 % no1 == 0) System.out.println("factor"); // 약수
			else if(no1 % no2 == 0) System.out.println("multiple"); // 배수
			else System.out.println("neither"); // 둘다 아님
			
			str = new StringTokenizer(br.readLine(), " ");
			no1 = Integer.parseInt(str.nextToken());
			no2 = Integer.parseInt(str.nextToken());
		}
	}
}
