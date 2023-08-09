package Baekjoon_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws IOException {
		
		// 6개의 숫자 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int[] arr = new int[6];
		// 순서대로 1 1 2 2 2 8 와 빼기
		
		for(int i=0 ; i<str.length ; i++) {
			
			
			switch (i) {
			case 0 : 
				arr[i] = 1 - Integer.parseInt(str[i]); 
				break;
			
			case 1 : 
				arr[i] = 1 - Integer.parseInt(str[i]); 
				break;
				
			case 2 : 
				arr[i] = 2 - Integer.parseInt(str[i]); 
				break;
				
			case 3 : 
				arr[i] = 2 - Integer.parseInt(str[i]); 
				break;
				
			case 4 : 
				arr[i] = 2 - Integer.parseInt(str[i]); 
				break;
				
			case 5 : 
				arr[i] = 8 - Integer.parseInt(str[i]); 
				break;
			}
		}
		
		// 출력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
