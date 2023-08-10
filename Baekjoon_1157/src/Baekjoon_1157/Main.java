package Baekjoon_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];

		// 알파벳 count
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 65]++;
			}else {
				arr[str.charAt(i) - 97]++;
			}
		}
		
		// 가장 큰 숫자 출력
		
		int max = -1;
		char ch = '?';
		for(int i = 0; i < 26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				ch = (char)(i + 65);
			}else if(max == arr[i]) {
				ch = '?';
			}
		}
		
		System.out.print(ch);
		
	}
}
