package hw2;
import java.util.Random;

public class TakimManager {
	
	private Takim[] takimlar = new Takim[100];
	private int i = 0;
	
	
	public void takimiDiziyeEkle(Takim takim) {
		this.takimlar[i] = takim;
		i++;
	}
	
	public void puanGoster(Takim[] takimlar) {
		for(Takim takim : takimlar) {
			if(takim != null) {
				System.out.println("Takım adı: " + takim.getName() + ", Takım puanı: " + takim.getPoint());
			}
		}
	}
	
	public void iflasEtmeDurumundakiTakimlar(Takim[] takimlar) {
		System.out.println("iflas durumundaki takimlar:\n");
		for(Takim takim : takimlar) {
			if(takim != null) {
				if(takim.getKasa() < 5000) {
					System.out.println(takim.getName());
				}
			}
		}
	}
	
	public void sampiyonuGoster(Takim[] takimlar) {
		Takim sampiyon = new Takim();
		sampiyon.setPoint(0);
		for(Takim takim : takimlar) {
			if(takim != null) {
				if(takim.getPoint() > sampiyon.getPoint()) {
					sampiyon = takim;
				}
			}
		}
		System.out.println("Şampiyon: " + sampiyon.getName());
	}
	
	public void macYap(Takim takim1, Takim takim2) {
		Random random = new Random();
		int sonuc = random.nextInt(1,4);
		if (sonuc == 1) {
			takim1.setKasa(takim1.getKasa() + 10000);
			takim1.setPoint(takim1.getPoint() + 3);
			System.out.println(takim1.getName() + " " + takim2.getName() + "'e karşı maçı kazanmıştır.");
		}
		else if (sonuc == 2) {
			takim2.setKasa(takim2.getKasa() + 10000);
			takim2.setPoint(takim2.getPoint() + 3);
			System.out.println(takim2.getName() + " " + takim1.getName() + "'e karşı maçı kazanmıştır.");
		}
		else {
			takim1.setKasa(takim1.getKasa() + 5000);
			takim1.setPoint(takim1.getPoint() + 1);
			takim2.setKasa(takim2.getKasa() + 5000);
			takim2.setPoint(takim2.getPoint() + 1);
			System.out.println(takim2.getName() + " vs " + takim1.getName() + " maçı berabere bitmiştir.");
		}
	}
	
	public void kasaGoster(Takim takim) {
		System.out.println("Takım ismi: " + takim.getName() + "\nTakım Kasası: " + takim.getKasa());
	}

	public Takim[] getTakimlar() {
		return takimlar;
	}

	public void setTakimlar(Takim[] takimlar) {
		this.takimlar = takimlar;
	}
	
}
