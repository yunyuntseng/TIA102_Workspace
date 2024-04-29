package hw2;

public class HW1_1 {
	// 請設計一隻java程式，計算1~1000的偶數和。
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1~1000的偶數和為" + sum);

		// 請設計一隻java程式，計算1~10的連乘積(1*2*3*...*10)(用for迴圈)
		int product1 = 1;
		for (int j = 1; j <= 10; j++) {
			product1 *= j;
		}
		System.out.println("1~10的連續積為" + product1);

		// 請設計一隻java程式，計算1~10的連乘積(1*2*3*...*10)(用while迴圈)
		int product2 = 1;
		int k = 1;
		while (k <= 10) {
			product2 *= k;
			k++;
		}
		System.out.println("1~10的連續積為" + product2);

		// 請設計一隻java程式，輸出結果為"1 4 9 16 25 36 49 64 81 100"
		int m = 0;
		int result1 = 1;
		int result2 = 0;
		while (result2 < 100) {
			result1 = 1 + 2 * m;
			result2 += result1;
			System.out.print(result2 + " ");
			m++;
		}

	}

}
