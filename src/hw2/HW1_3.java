package hw2;

public class HW1_3 {
	public static void main(String[] args) {
		// 請設計出一隻java程式，列印出字母三角形

		// a在Unicode編碼表中十六進位的為0041，換算十進位為65。
		for (char a = 65; a <= 70; a++) {
			for (int b = 65; b <= a; b++) {
				System.out.print(a);

			}
			System.out.println();

		}

	}

}
