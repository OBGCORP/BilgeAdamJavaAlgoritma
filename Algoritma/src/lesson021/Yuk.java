package lesson021;

import java.time.LocalDate;

public class Yuk {

	private String ismi;
	private double agirlik;
	private LocalDate kabulTarihi;
	
	
	
	public Yuk(String ismi, double agirlik, LocalDate kabulTarihi) {
		super();
		this.ismi = ismi;
		this.agirlik = agirlik;
		this.kabulTarihi = kabulTarihi;
	}
	public String getIsmi() {
		return ismi;
	}
	public void setIsmi(String ismi) {
		this.ismi = ismi;
	}
	public double getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}
	public LocalDate getKabulTarihi() {
		return kabulTarihi;
	}
	public void setKabulTarihi(LocalDate kabulTarihi) {
		this.kabulTarihi = kabulTarihi;
	}
	@Override
	public String toString() {
		return "Yuk [ismi=" + ismi + ", agirlik=" + agirlik + ", kabulTarihi=" + kabulTarihi + "]";
	}
	
}
