package HW1;

public class HW1_4 {
	public static void main(String[]args) {
		final double PI = 3.1415;
		int r = 5;
		int result1 = r * 2 * (int)PI; //圓周長
		int result2 = r * r * (int)PI; //圓面積
		System.out.println("圓周長為" + result1 + "，園面積為" + result2 + "。");
	}

}
