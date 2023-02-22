package lesson011;
import java.util.Scanner;

public class Sepet {
	static Scanner scanner = new Scanner(System.in);
	
	private Product[] products;
	private int totalPrice;
	private static int index = 0;
	private Product product;
	
	//product sınıfının içinde bir değişken tutatlım bu değişken ürünün satışta mı stoğu bitmiş mi olduğunu göstersin
	
	//product sınıfının içine metod yazalım
	//aktif olmayan ürünü gösterimden kaldırsın
	
	public void sepeteUrunEkle(Product product) {
		if(product.getStock() > 0) {
			if(index > 10) {
				System.out.println("ürün sayısı 10'u geçemez");
			}
			else {
				products[index] = product;
				index++;
				//her ürün eklendiğinde total price artacak
				//her ürün eklendiğinde stok azalacak
				//10 taneden fazla ürün alamasın, kullanıcıya bilgi verelim
				setTotalPrice(totalPrice += product.getPrice());
				product.setStock(product.getStock()-1);
				product.gosterimdenKaldir();
			}
		}
		else {
			System.out.println("ürün stokta yok");
		}
	}
	
	//sepetteki ürünleri göster metodu yazalım
	//for ve ya foreach
	//1- ürün ismi
	//2- ürün ismi
	//null değerleri yazdırmayalım
	
	public void sepetiGoster() {
		int i = 1;
		for(Product product : products) {
			if(product != null) {
				System.out.println(i + "- " + product.getName());
				i++;
			}
		}
	}
	

	
	public Sepet() {
		this.products = new Product[10];
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public int getIndex() {
		return index;
	}
	
	
}
