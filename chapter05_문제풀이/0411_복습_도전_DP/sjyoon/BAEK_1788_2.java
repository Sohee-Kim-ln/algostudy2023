import java.util.Arrays;
import java.util.Scanner;

public class BAEK_1788_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[Math.abs(n)+1];
		Arrays.fill(arr, -2);
		
//		arr[0] = 0;
//		arr[1] = 1;
		
		int value;
		int pm;
		
		if (n > 0) {
			value = fibo(n);
			pm = 1;
		}else if (n < 0) {
			value = fibo(n * (-1));
			pm = -1;
		} else {
			value = 0;
			pm = 0;
		}
		
		
		if (pm == 1) System.out.println(1);
		else if (pm == 0) System.out.println(0);
		else System.out.println(-1);
		
		value = Math.abs(value) % 1000000000;
		
		System.out.println(value);

		sc.close();
	}
	
	static int n;
	static int[] arr;
	
	static int fibo(int n) {
		if (n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}

		
		else {
			if (arr[n-1] == -2 && arr[n-2] == -2) {
				arr[n] = fibo(n-1) + fibo(n-2);
			}else if (arr[n-1] == -2) {
				arr[n] = fibo(n-1) + arr[n-2];
			}else if (arr[n-2] == -2) {
				arr[n] = arr[n-1] + fibo(n-2);
			}else {
				arr[n] = arr[n-1] + arr[n-2];
			}
			
			return arr[n];
		}
	}
}