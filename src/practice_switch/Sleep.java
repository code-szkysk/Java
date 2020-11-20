package practice_switch;

import java.util.Random;

public class Sleep {

	public static void main(String[] args) {
		
		int num = new Random().nextInt(4);
		
		switch(num) {
		case 1:	System.out.println("素直に寝る"); break;
		case 2: System.out.println("読書する"); break;
		case 3: System.out.println("夜食を食べる"); break;
		case 4: System.out.println("動画を見る"); break;
		}

	}

}
