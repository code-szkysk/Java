package practice_class;

public class Fraction {

	int numer; // 分子
	int denom; // 分母

	Fraction(int numer, int denom){ // フィールド代入する時も引数を忘れずに
		this.numer = numer;
		this.denom = denom;
	}

	Fraction(int numer){
		this(numer, 1);
	}

	Fraction(){
		this(0, 1);
	}

	public String toString() {
		return numer + "/" + denom;
	}



}
