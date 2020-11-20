package 基礎練習問題;

import java.util.Scanner;

public class Try10 {

	public static void main(String[] args) {

		String[] id = {"taro", "jiro", "hanako"};
		String[] password = {"inu", "neko", "usagi"};

		System.out.println("id 入力 > ");
		String inputID = new Scanner(System.in).nextLine();

		System.out.println("password 入力 > ");
		String inputPass = new Scanner(System.in).nextLine();

		boolean isLogin = false; // 判定用の変数を用意

		for(int i=0; i<3; i++) { // IDとPASSの整合性チェック
			if(inputID.equals(id[i]) && inputPass.equals(password[i])) {
				isLogin = true;
				break;
			}
		}

		if(isLogin) {
			System.out.println("ログインしました");
		}else {
			System.out.println("ログイン失敗：IDまたはパスワードが違います");
		}

	}

}
