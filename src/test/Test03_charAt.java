package test;

public class Test03_charAt {

	public static void main(String[] args) {
		
		String a = "ABあい";
		
		System.out.print(a.charAt(0));
		System.out.print(a.charAt(1));
		System.out.print(a.charAt(2));
		System.out.println(a.charAt(3));
		
		System.out.println("---------");
		System.out.print(a.charAt(a.length()-1));
		System.out.print(a.charAt(a.length()-2));
		System.out.print(a.charAt(a.length()-3));

	}

}
