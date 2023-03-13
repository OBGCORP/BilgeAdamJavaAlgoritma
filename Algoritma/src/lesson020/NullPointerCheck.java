package lesson020;

public class NullPointerCheck extends Exception{

	String mesaj;

	public NullPointerCheck(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
}
