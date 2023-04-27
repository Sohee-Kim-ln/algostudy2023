package study0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek17419 {
	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		//숫자 길이
        int N = Integer.parseInt(bfr.readLine());
		
        //숫자 스트링 입력받기
        String tempS = bfr.readLine();
		
        //1 갯수
		int cnt = 0;
		
		//문자열 탐색해가면서 1이 있으면 카운트++
		for (int i = 0; i < N; i++)
			if (tempS.charAt(i) == 49)
				cnt++;

		//출력
		System.out.print(cnt);
	}
}