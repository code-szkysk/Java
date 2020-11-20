package 基礎練習問題;

public class Try09 {

	public static void main(String[] args) {

		int[] p1 = {2,6};
		int[] p2 = {5,2};

		int lineA = p1[1] - p2[1];
		int lineB = p1[0] - p2[0];

		double lineAA = Math.pow(lineA, 2);
		double lineBB = Math.pow(lineB, 2);
		double lineC = Math.sqrt(lineAA + lineBB);

		System.out.println("Aの長さ" + Math.abs(lineA));
		System.out.println("Bの長さ" + Math.abs(lineB));
		System.out.println("Cの長さ" + Math.abs((int)lineC));

	}

}
