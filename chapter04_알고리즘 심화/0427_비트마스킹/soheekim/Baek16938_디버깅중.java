package study0427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//디버깅중
public class Baek16938 {
	static int N,L,R,X,cnt;
	static int[] score;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tempS = bfr.readLine().split(" ");
		N=Integer.parseInt(tempS[0]);
		L=Integer.parseInt(tempS[1]);
		R=Integer.parseInt(tempS[2]);
		X=Integer.parseInt(tempS[3]);
		cnt=0;
		
		score=new int[N];
		
		tempS = bfr.readLine().split(" ");
		
		for(int i=0;i<N;i++) {
			score[i]=Integer.parseInt(tempS[i]);
		}
		
		System.out.println(Arrays.toString(score));
		
		
		for(int i=0;i<N;i++) {
			System.out.println(i+"선택으로 시작");
			choose(i+1,score[i],score[i],score[i]);
		}
		System.out.println(cnt);
	}
	public static void choose(int idx,int curSum,int min,int max) {
		System.out.println(idx+" "+curSum+" "+min);
		if(curSum>R) {
			System.out.println("넘침");
			return;
		}
		
		if(idx>=N) {
			if(curSum>=L && max-min>=X) {
				System.out.println(curSum+" "+min+" "+max+" 넣음 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				cnt++;
			}
			return;
		}
		
		else {
			System.out.println(idx +" 선택");
			choose(idx+1,curSum+score[idx],min,score[idx]);
			
			System.out.println(idx +" 선택 안함");
			choose(idx+1,curSum,min,max);
		}
		
	}
}
