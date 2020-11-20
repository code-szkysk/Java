package 基礎練習問題;

public class Try03 {

	public static void main(String[] args) {

		int[] test = {100,88,95,63,76,81,59};

		//System.out.println(test[5]);

		int sum = 0; // 配列の合計を出す場合はfor文の前に変数を準備
		int count = 0; // カウントするための変数を準備

		for(int array : test) {
			sum += array;

			if(array >= 80) {
				count++;
			}
		}

		int avg = sum / test.length;

		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
		System.out.println("80点以上：" + count);

	}

}
