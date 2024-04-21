package HW1;

public class HW1_3 {
	public static void main(String[] args) {
		int second = 256559;
		int minute = second / 60;
		int hour = second / (60 * 60);
		int day = second / (60 * 60 * 24);
		System.out.println("256559秒為" + day + "天、" + hour + "小時、" + minute + "分鐘、" + second + "秒。");
	}

}
