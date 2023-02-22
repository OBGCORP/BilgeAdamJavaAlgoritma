package lesson010;

public class Profile {
	//attribute, property, field
	//gerekli attribute leri tanımlayalaım
	
	public String profilResmi;
	public String kullaniciAdi;
	public String isim;
	
	public int takipciSayisi;
	public int takipSayisi;
	public boolean maviTik;
	
	public String[] posts = new String[10];
	public int postSayisi;
	
	//post oluştur metodu
	//isim --> post oluşturdu desin
	
	//profilIsminiGuncelle metodu
	//method isim alsın ve ismi güncellesin
	
	//gelenIstegiKabulEt
	//takipçi sayısı artacak
	
	public String postOlustur(String posts) {
		this.posts[postSayisi] = posts;
		this.postSayisi++;
		//this --> bulunduğu sınıfı gösterir
		return isim + " --> post oluşturdu";
	}
	
	public void profilIsminiGuncelle(String isim) {
		this.isim = isim;
	}
	
	public void gelenIstegiKabulEt() {
		takipciSayisi++;
		maviTik();
	}
	public void kullaniciSil() {
		takipciSayisi--;
		maviTik();
	}
	
	//takipci sayısı 5 ten fazlaysa kullanıcıya mavi tik verelim
	//maviTik  metodu
	
	private void maviTik() {
		if(takipciSayisi > 5) {
			maviTik = true;
		}
		else {
			maviTik = false;
		}
	}

	//bilgileri göster metodu
	
	public String bilgileriGoster() {
		return "Profile [isim=" + isim + ", takipciSayisi=" + takipciSayisi + ", maviTik=" + maviTik + ", postSayisi="
				+ postSayisi + "]";
	}
	

	
}
