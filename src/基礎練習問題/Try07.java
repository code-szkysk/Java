package 基礎練習問題;

public class Try07 { // 逆から１文字ずつ文字列を出力する

	public static void main(String[] args) {

	String mojiretu = "絶対にエンジニアになる！！";

	System.out.println(mojiretu);
	System.out.println(mojiretu.length() + "文字");

	// length()-1 が最後の文字の理由：0からスタートするため
	for(int i=mojiretu.length()-1; i>=0; i--) {
		System.out.print(mojiretu.charAt(i));
	}

	}

}
