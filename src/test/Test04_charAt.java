package test;

public class Test04_charAt {

	public static void main(String[] args) {

		String descision = "！るなにアニジンエ対絶";
		
		for(int i=descision.length()-1; i>=0; i--) {
			System.out.print(descision.charAt(i));
		}

	}

}
