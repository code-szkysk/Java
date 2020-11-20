package practice_class;

public class Okodukai {

	String okasi;
	int money;

	Okodukai(String okasi, int money){
		this.okasi = okasi;
		this.money = money;
	}

	public void buy() {
		System.out.println("お母さんから" + this.money + "円もらいました");
		System.out.println("お店で" + this.okasi + "を買いました");
	}

}
