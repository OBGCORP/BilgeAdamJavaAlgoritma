package hw2;

public class Takim {

	private String name;
	private int point;
	private int kasa;
	
	public Takim() {		
	}
	
	public Takim(String name) {
		super();
		this.name = name;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
		
	public String getName() {
		return name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public int getKasa() {
		return kasa;
	}
	
	public void setKasa(int kasa) {
		this.kasa = kasa;
	}
	
}
