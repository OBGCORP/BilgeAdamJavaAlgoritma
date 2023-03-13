package lesson022;

public class Kisi {

	private String name;
	private int age;
	private ECinsiyet cinsiyet;
	private int salary;
	
	public Kisi(String name, int age, ECinsiyet cinsiyet, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.cinsiyet = cinsiyet;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ECinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(ECinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	@Override
	public String toString() {
		return "Kisi [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public void elliYasUstuMesaj() {
		System.out.println(getName() + " 50 yaş üstüdür.");
	}
}
