package lesson021;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Uygulama {

	Liman liman;
	static Scanner scanner = new Scanner(System.in);
	
	public Uygulama(){
		this.liman = new Liman();
	}
	
	public void yukYeriSec() {
		System.out.println("Lütfen bir yük yeri seçin");
		int index = scanner.nextInt();
		try {
			Yuk yuk = liman.getYukler()[index];
		} catch (Exception e) {
			System.out.println("Lütfen sınırlar dahilinde bir yer seçiniz");
		}
	}
	
	public int yukYeriSec2() {
		liman.getYukler()[0] = new Yuk("1 palet kıyafet", 150, LocalDate.now());
		int index = Util.intDegerAlma("Lütfen Yük yeri seçin");
		if(index < 0 || index >= liman.getYukler().length) {
			throw new LimanAppException(EErrorType.OUT_OF_BOUNDS);
		}
		else if(liman.getYukler()[index] != null) {
			throw new LimanAppException(EErrorType.SEAT_ALREADY_OCCPUIED);
		}
		return index;
	}
	
	public double agirlikBelirle() {
		double weight = Util.doubleDegerAlma("Yük ağırlığını giriniz");
		if(weight < 100) {
			throw new LimanAppException(EErrorType.INVALID_WEIGHT);
		}
		return weight;
	}
	
	public LocalDate kabulTarihi() {
		LocalDate date = Util.stringTarih();
		
		if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			throw new LimanAppException(EErrorType.OUT_OF_SHIFT_DAY);
		}
		else if(date.isBefore(LocalDate.now())) {
			throw new LimanAppException(EErrorType.PAST_DATE);
		}
	return date;
	}
	
	public Yuk yukOlustur() {
		System.out.println("Yük ismi giriniz");
		String isim = "";
		try {
			isim = scanner.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		yukYeriSec2();
		Yuk yuk = new Yuk(isim, agirlikBelirle(), kabulTarihi());
		return yuk;
	}
	
	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		try {
			uygulama.yukYeriSec2();
			uygulama.agirlikBelirle();
			uygulama.kabulTarihi();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}
