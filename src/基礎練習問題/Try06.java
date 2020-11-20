package 基礎練習問題;

public class Try06 {
	public static void main(String[] args) {
	
	String[] member = {"相田","井上","上田","榎木","岡本","加藤","木下","工藤",
						"ケント・デリカット","小林"};
	
	for(int i=0; i<member.length; i++) {
		
		System.out.print(member[i]);

		if(i%5 == 4) {
			System.out.println(); // 改行する
		}else {
			System.out.print(",");
		}
	}
	
	}
}
