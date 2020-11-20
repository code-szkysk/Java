package 基礎練習問題;

public class Try08 {

	public static void main(String[] args) {

		int[][] days = new int[6][6];

		int startIndex = 3; // 1が入る配列番号の位置
		int endDay = 31; // 配列に入る最終の値
		int day = 1;

		for(int i=0; i<days.length; i++) {
			for(int j=0; j<days[i].length; j++) {
				if(!(i==0 && j<startIndex) && day <= endDay) {
					days[i][j] = day++;
				}
			}
		}

		System.out.println("2020年4月");
		for(int[] array : days) {
			for(int n : array) {
				if(n%7 == 5) {
					System.out.println();
				}
				if(n==0) { // 値が0なら
					System.out.print("xx ");
				}else {
					if(n<10) {
						System.out.print("0" + n + " ");
					}else {
						System.out.print(n + " ");
					}
				}
			}
		}

	}

}
