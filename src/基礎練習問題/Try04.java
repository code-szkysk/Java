package 基礎練習問題;

// 計算式が分からない
public class Try04 {

	public static void main(String[] args) {

		int time = 100_000;

		int sec = time % 60; // 余りが秒数
		int min = time / 60; // /60で 1666分

		int hour = min / 60; // /60で 27時間
		min = min % 60; // 1666分/60の余りが時間にできない分

		int day = hour / 24; // 27/24で1日
		hour = hour % 24; // 27時間/24の余りが日にできない時間

		System.out.println(time + "秒は");
		System.out.println(day + "日：" + hour + "時間：" + min + "分：" + sec + "秒");

//		int oneday = 24 * 60 * 60;
//		System.out.println("一日の秒数は " + oneday + "秒");
//
//		int seconds = 1000 % 60;
//		int temp = 1000 / 60;
//		int hour = temp /60;
//		int minuts = temp % 60;
//
//		System.out.println(hour + "時間" + minuts + "分" + seconds + "秒");
	}

}
