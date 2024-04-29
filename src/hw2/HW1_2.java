package hw2;

public class HW1_2 {
	public static void main(String[] args) {
		// 列出1~49中沒有包含"4"的數字，並計算共幾個。
		int count = 0;
		for (int a = 1; a <= 39; a++) {
			if (a % 10 != 4) {
				System.out.print(a + " ");
				count++;
			}
		}
		System.out.println();
		System.out.print("共有" + count + "個數字");

		System.out.println();

		// 請設計出一隻列印結果為數字三角形的java程式。

		for (int b = 10; b >= 1; b--) {
			for (int c = 1; c <= b; c++) {
				System.out.print(c);

			}
			System.out.println();
		}

	}
}
