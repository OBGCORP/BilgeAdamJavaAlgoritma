package lesson015.veteriner;

public abstract class Hayvan {

	private String name;
	private boolean kayitliMi;
	private String dogumTarihi;
		

	public Hayvan(String name, boolean kayitliMi, String dogumTarihi) {
		super();
		this.name = name;
		this.kayitliMi = kayitliMi;
		this.dogumTarihi = dogumTarihi;
	}
	
	public abstract void bilgileriGoster();
	
	public abstract void karneOlustur();
	
	public boolean isKayitliMi() {
		return kayitliMi;
	}
	
	public void setKayitliMi(boolean kayitliMi) {
		this.kayitliMi = kayitliMi;
	}
	
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hayvan [name=" + name + ", kayitliMi=" + kayitliMi + ", dogumTarihi=" + dogumTarihi + "]";
	}	

}
