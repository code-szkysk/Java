package 基礎練習問題;

import java.util.Scanner;

public class Try02 {

	public static void main(String[] args) {

		System.out.println("半径を入力");
		int r = new Scanner(System.in).nextInt();

		double circle = r * r * 3.14;
		System.out.println("円の面積は" + circle + "です");

		double circumference = r * 2 * 3.14; // 円周は直径*3.14
		System.out.println("円周は" + circumference + "です");

	}

}
