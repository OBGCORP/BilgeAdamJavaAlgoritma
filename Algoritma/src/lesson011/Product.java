package lesson011;
import java.util.Scanner;
import lesson011.helper.RandomGenerateID;

public class Product {
		
	static Scanner scanner = new Scanner(System.in);
	private String id;
	private int price;
	private String name;
	private int stock;	
	private boolean isActive = true;
	private String productCode;
	
	
	public Product() {
		//bir sınıftan nesne ürettiğimizde arka tarafta çalışan ilk metoddur
		System.out.println("product sınıfının 0 parametreli constructor ı çalıştı");
		this.id = RandomGenerateID.IDGenerator();
	}
	//method overloading
	public Product(String name, int stock, int price) {
		System.out.println("product sınıfının 4 parametreli constructor ı çalıştı");
		this.name = name;
		this.id = RandomGenerateID.IDGenerator();
		this.price = price;
		this.stock = stock;
		this.productCode = RandomGenerateID.generateProductCode(name);
	}
	
	public void gosterimdenKaldir() {
		if(getStock() <= 0) {
			setActive(false);
			System.out.println(getName() + " gösterimden kaldırıldı.");
		}
	}
	
	public void bilgileriYazdir() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Product [id=" + getId() + ", price=" + getPrice() + ", name=" + getName() + ", stock=" + getStock() + "]";
	}
	
	public void ismiGuncelle (String name) {
		System.out.println(getName() + " ürünün ismi " + name + " olarak güncellendi.");
		setName(name);
	}
	
	public void veriTabaninaKaydet() {
		System.out.println(getName() + " veritabanına kaydedildi");
	}
	
	public static Product productEkle() {
		System.out.println("Product name giriniz");
		String name = scanner.nextLine();
		System.out.println("Product price giriniz");
		int price = scanner.nextInt();
		System.out.println("Product stock giriniz");
		int stock = scanner.nextInt();
		Product product = new Product(name, stock, price);
		return product;
	}

	public String getId() {
		return id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
				
}
