package marathon2.soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Rehber {

	private HashMap<String, String> kayitlar = new HashMap<String, String>();

	public Rehber() {
		super();
		dosyadanKayitCek();
	}

	private void dosyadanKayitCek() {
		try (BufferedReader reader = new BufferedReader(new FileReader
				("C:\\Users\\obgun\\Desktop\\JavaWsUygulama\\Algoritma\\src\\marathon2\\soru1\\rehber.txt"))){ 
			//text doyasını package içerisinde tanımladığım için relative path yerine absolute path kullandım,
			//text dosyası proje içerisinde tanımlanırsa relative path de kullanılabilir. 
			String satir = null;
			while((satir = reader.readLine()) != null) {
				getKayitlar().put(satir.split(";")[0], satir.split(";")[2].trim());
			}
		} catch (FileNotFoundException e) {
			System.out.println("rehber dosyası bulunamadı");
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("dosyadan okuma hatası");
			e1.printStackTrace();
		}
	}
	
	public void aramaYap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen telefonunu aradığınız kişinin adını giriniz: ");
		String ad = scanner.nextLine().trim();//kullanıcı yanlışlıkla space girerse sorun çıkmaması için trim
		System.out.print("Lütfen telefonunu aradığınız kişinin soyadını giriniz: ");
		String soyad = scanner.nextLine().trim();
		System.out.println((getKayitlar().containsKey(ad + " " + soyad)) ? 
				ad + " " + soyad + " isimli kişinin telefon numarası: " + getKayitlar().get(ad + " " + soyad) :
				"Aradığınız kişi rehberde kayıtlı değil!");
	}
	
//	//bonus method
//	public void aramaYapIgnoreCase() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Lütfen telefonunu aradığınız kişinin adını giriniz: ");
//		String ad = scanner.nextLine().trim().toLowerCase();
//		System.out.print("Lütfen telefonunu aradığınız kişinin soyadını giriniz: ");
//		String soyad = scanner.nextLine().trim().toLowerCase();
//		ad = ad.replace(ad.charAt(0), (String.valueOf(ad.charAt(0)).toUpperCase().charAt(0)));
//		soyad = soyad.replace(soyad.charAt(0), (String.valueOf(soyad.charAt(0)).toUpperCase().charAt(0)));
//		System.out.println((getKayitlar().containsKey(ad + " " + soyad)) ? 
//				ad + " " + soyad + " isimli kişinin telefon numarası: " + getKayitlar().get(ad + " " + soyad) :
//				"Aradığınız kişi rehberde kayıtlı değil!");
//	}
	
	public HashMap<String, String> getKayitlar() {
		return kayitlar;
	}
	
}
