package lesson015.veteriner;

public abstract class Insan {
	
	private String tcKimlik;
	private String name;
	
	
	public Insan(String tcKimlik, String name) {
		super();
		this.tcKimlik = tcKimlik;
		this.name = name;
	}
	
	public abstract void bilgileriGoster();
	
	public String getTcKimlik() {
		return tcKimlik;
	}
	
	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Insan [tcKimlik=" + tcKimlik + ", name=" + name + "]";
	}
	
}
