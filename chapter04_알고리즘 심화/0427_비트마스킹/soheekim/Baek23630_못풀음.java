package study0427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek23630 {
	static int N;
	static int[] nums;
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tempS = bfr.readLine().split(" ");
		N=Integer.parseInt(tempS[0]);
		
		nums = new int[N];
		
		tempS = bfr.readLine().split(" ");
		for(int i=0;i<N;i++) {
			nums[i]=Integer.parseInt(tempS[i]);
		}
		
		
		
		
	}
	
//	public static void bits(int curRes)
	
}
