package Baekjoon_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 수 2개 받기
		String[] arr  = br.readLine().split(" ");
		
		// 뒤집기
		String A = arr[0];
		String B = arr[1];
		
		String rA = "";
		String rB = "";
		
		for(int i=A.length()-1 ; i>=0 ; i--) {
			rA = rA + A.charAt(i);
		}
		
		for(int i=B.length()-1 ; i>=0 ; i--) {
			rB = rB + B.charAt(i);
		}
		
		int numA = Integer.parseInt(rA);
		int numB = Integer.parseInt(rB);

		// 비교하고 큰 것 출력
		if(numB > numA) {
			System.out.println(numB);
		}else {
			System.out.println(numA);
		}
	}

}
