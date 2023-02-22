package lesson011;

public class Main {
	
	public static void sepeteEkle(Product product) {
		Sepet sepet = new Sepet();
		sepet.sepeteUrunEkle(product);
		
	}
	
	public static void main(String[] args) {
		//product sınıfı oluşturalım
		//id, price, name, stock
		//bilgileriGoster metodu yazalım
		
		//değişkenler private
		//boş constructor
		
		//veritabanına kaydet --> ürün ismi + veritabanına kaydedildi
		//urunu guncelle --> ürün ismini güncelleyecek parametre string
		
		//farklı paket açalım o paketin içinde random id oluşturan class olsun
		//her product nesnesi ürettiğimizde bu random id nesnenin idsi olarak atansın
		
		//sepet sınıfı oluşturalım
		//products, totalPrice
		
		//sepete ürün ekle metodu
		//void, parametre olarak product tipinde ürün alsın
		//gelen product ı arrayin içinde alsın.
		
		Product product1 = new Product();
		product1.setName("asus");
		product1.setPrice(15000);
		product1.setStock(100);
		
		product1.bilgileriYazdir();
		
		Product product2 = new Product("apple", 100, 20000);
		product2.bilgileriYazdir();
		
		product2.veriTabaninaKaydet();
		product2.ismiGuncelle("lenovo");
		product2.bilgileriYazdir();
		
		Sepet sepet1 = new Sepet();
		Sepet sepet2 = new Sepet();
		sepet1.sepeteUrunEkle(product1);
		System.out.println(sepet1.getIndex());
		
		Product product3 = new Product();
		product3.setName("HP");
		product3.gosterimdenKaldir();
		System.out.println(product3.isActive());
		
		sepet1.sepetiGoster();
		
		Product product4 = Product.productEkle();
		
		
	}

}
