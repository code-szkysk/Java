package 基礎練習問題;

public class Try05 {

	public static void main(String[] args) {

		int price;
		int yearsOld = 12;
		boolean woman = true;

		if(yearsOld <= 12) {
			price = 500;
		}else if(yearsOld < 18) {
			price = 1000;
		}else{
			price = 1500;
		}

		if(woman) { // 女性ならば一割引き
			price *= 0.9 ;
		}

		System.out.println("料金は" + price + "円です。");

	}

}
