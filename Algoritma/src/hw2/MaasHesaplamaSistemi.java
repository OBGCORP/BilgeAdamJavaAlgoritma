package hw2;

public class MaasHesaplamaSistemi {

	private String name;
	private double salary;
	private double workHours;
	private int hireYear;
	private double tax;
	private double bonus;
	private double salaryRaise;
	
	public MaasHesaplamaSistemi() {
		
	}
	
	public MaasHesaplamaSistemi(String name, double salary, double workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		tax();
		bonus();
		salaryRaise();
		yeniMaasBilgileri();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	private void tax() {
		if(getSalary() < 2000) {
			setTax(0);
		}
		else {
			setTax(getSalary() * 0.05);
		}
	}
	
	private void bonus() {
		if(getWorkHours() > 40.0 ){
			setBonus((getWorkHours() - 40) * 30);
		}
	}
	
	private void salaryRaise() {
		if(2022 - getHireYear() < 10) {
			setSalaryRaise(getSalary() * 0.5);
		}
		else if(2022 - getHireYear() < 20) {
			setSalaryRaise(getSalary() * 0.1);
		}
		else {
			setSalaryRaise(getSalary() * 0.15);
		}
	}
	
	private void yeniMaasBilgileri() {
		System.out.println("Personel adı: " + getName());
		System.out.println("Şu anki maaşı: " + getSalary() + " TL");
		System.out.println("Çalışma saati: " + getWorkHours());
		System.out.println("İşe başlama yılı: " + getHireYear());
		System.out.println("--------------------------");
		System.out.println("Hesaplanan vergi: " + getTax() + " TL");
		System.out.println("Hesaplanan bonus: " + getBonus() + " TL");
		System.out.println("Hesaplanan baz maaş artışı: " + getSalaryRaise() + " TL");
		System.out.println("--------------------------");
		System.out.println("Uygulanacak toplam maaş artışı");
		System.out.println("(Bonus + baz maaş artışı - vergi)");
		System.out.println(getBonus() - getTax() + getSalaryRaise() + " TL");
		System.out.println("--------------------------");
		System.out.println("Hesaplanan yeni maaş: " + (getBonus() - getTax() + getSalaryRaise() + getSalary()) + " TL");
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getWorkHours() {
		return workHours;
	}
	
	public void setWorkHours(float workHours) {
		this.workHours = workHours;
	}
	
	public int getHireYear() {
		return hireYear;
	}
	
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax(double d) {
		this.tax = d;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalaryRaise() {
		return salaryRaise;
	}
	
	public void setSalaryRaise(double salaryRaise) {
		this.salaryRaise = salaryRaise;
	}
	
}
