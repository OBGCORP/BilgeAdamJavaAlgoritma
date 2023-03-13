package marathon2.soru3;

import java.util.Objects;

public abstract class Hayvan {

	private String ad;
	private int kilosu;
	private int uzunlugu;
	private boolean tehlikeliMi;
	private String cinsi;
	
	public Hayvan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi, String cinsi) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.tehlikeliMi = tehlikeliMi;
		this.cinsi = cinsi;
	}

	public abstract void sesCikar();
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilosu() {
		return kilosu;
	}

	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}

	public int getUzunlugu() {
		return uzunlugu;
	}

	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}

	public boolean isTehlikeliMi() {
		return tehlikeliMi;
	}

	public void setTehlikeliMi(boolean tehlikeliMi) {
		this.tehlikeliMi = tehlikeliMi;
	}

	public String getCinsi() {
		return cinsi;
	}

	public void setCinsi(String cinsi) {
		this.cinsi = cinsi;
	}

	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ ", cinsi=" + cinsi + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ad);
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Hayvan other = (Hayvan) obj;
		return Objects.equals(ad, other.ad);
	}
	
}
