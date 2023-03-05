package hw3;

public class Kanal {

	private String kanalAdi;
	private int kanalNo;
	
	public Kanal(String kanalAdi, int kanalNo) {
		this.kanalAdi = kanalAdi;
		this.kanalNo = kanalNo;
	}
	
	public String getKanalAdi() {
		return this.kanalAdi;
	}
	
	public void setKanalAdi(String kanalAdi) {
		this.kanalAdi = kanalAdi;
	}
	
	public int getKanalNo() {
		return this.kanalNo;
	}
	
	public void setKanalNo(int kanalNo) {
		this.kanalNo = kanalNo;
	}
	
}
