package baekjoon;

import java.util.Scanner;

public class BAEK2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextInt();
		}
		// 선택정렬 사용
		for (int i = 0; i < T; i++) {
			for (int j = i + 1; j < T; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
