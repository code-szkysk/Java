package practice_class;

public class City {

	String name;
	int population;
	double area;

	City(String name, int population, double area){
		this.name = name;
		this.population = population;
		this.area = area;
	}

	City(String name){
		this(name, 0, 1);
	}

	public double populationDensity() {
		return this.population / this.area;
	}

	public void disp() {
		System.out.println(this.name + "市");
		System.out.println("人口数:" + this.population);
		System.out.println("面積:" + this.area);
	}

}
