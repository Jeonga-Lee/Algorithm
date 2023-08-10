package Baekjoon_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		palindrome(str);
	
	}
	
	static void palindrome(String str) {
		int length = str.length()-1;
		
		for(int i=0 ; i<str.length()/2 ; i++) {
			if(str.charAt(i) != str.charAt(length-i)) {
				System.out.print(0);
				return;
			}
		}	
		
		System.out.print(1);
	}
}
