package testninenine;

public class TestNineNine3 {
	public static void main(String[] args) {
		int i = 1;
		int j;
		while (i <= 9) {
			j = 1;

			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}

}
