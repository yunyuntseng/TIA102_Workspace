package HW1;

public class HW1_3 {
	public static void main(String[] args) {
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int second = 256559;
		int day = second / (60 * 60 * 24);
		int day1 = second % (60 * 60 * 24);
		int hour = day1 / (60 * 60);
		int hour1 = day1 % (60 * 60);
		int minute = hour1 / (60);
		int second1 = hour1 % (60 );

		System.out.println("256559秒為" + day + "天" + hour + "小時" + minute + "分鐘" + second1 + "秒。");
		
	}

}
