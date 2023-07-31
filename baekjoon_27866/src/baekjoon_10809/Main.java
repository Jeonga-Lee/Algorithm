package baekjoon_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main (String args[]) throws IOException{
		
		// ASCII
		// 대문자 : 65 ~ 90
		// 소문자 : 97 ~ 122
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = br.readLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			System.out.println(ch - 'a');
			System.out.println(arr[ch - 'a']);
			
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
	}
}

