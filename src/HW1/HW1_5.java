package HW1;

public class HW1_5 {
	public static void main(String[] args) {
		// 複利公式：本利和FV = 本金PV*(1+年利率i)期間n次方
		int pv = 1500000;
		double i = 1.02;
		double n = 10.0;
		double result = Math.pow(i, n);
		double fv = pv * result;
		System.out.println("本金150萬，年利率2%，10年期間利息持續存入銀行，本金加利息共" + fv + "元。");

	}

}
