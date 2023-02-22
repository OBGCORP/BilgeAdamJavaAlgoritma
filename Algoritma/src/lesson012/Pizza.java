package lesson012;

public class Pizza {
	
	private static final int VEGGIE_PRICE = 300;
	private static final int NORMAL_PRICE = 200;
	private static final int SAUCE_PRICE = 50;
	private static final int CHEESE_PRICE = 100;
	private int sauceCounter = 0;
	private int cheeseCounter = 0;
	private int price;
	private boolean isVeggie;
	private boolean isDineIn = true;
	
	public Pizza() {
		
	}
	
	public Pizza(boolean isVeggie) {
		setVeggie(isVeggie);
		setPrice(isVeggie ? VEGGIE_PRICE : NORMAL_PRICE);
	}
	
	public void pizzaTipiDegistir() {
		if(isVeggie == true) {
			setVeggie(false);
			setPrice(getPrice() - 100);
			System.out.println("Pizza tipi \"Normal\" olarak güncellendi.");
		}
		else {
			setVeggie(true);
			setPrice(getPrice() + 100);
			System.out.println("Pizza tipi \"Vejetaryen\" olarak güncellendi.");
		}
	}
	
	public void sosEkle () {
		System.out.println("Sos eklediniz. (+50 TL)");
		setPrice(getPrice() + SAUCE_PRICE);
		System.out.println("An itibariyle pizza da bulunan sos sayısı: " + (++sauceCounter) + "\n");
	}
	
	public void sosCikar () {
		if(sauceCounter > 0) {
			System.out.println("Sos çıkardınız. (-50 TL)\n");
			setPrice(getPrice() - SAUCE_PRICE);
			System.out.println("An itibariyle pizza da bulunan sos sayısı: " + --sauceCounter);
		}
		else {
			System.out.println("Pizzanızda zaten sos bulunmuyor.\n");
		}
			
	}
	
	public void peynirEkle () {
		System.out.println("Peynir eklediniz. (+100 TL)");
		setPrice(getPrice() + CHEESE_PRICE);
		System.out.println("An itibariyle pizza da bulunan peynir sayısı: " + (++cheeseCounter) + "\n");
	}
	
	public void peynirCikar () {
		if(cheeseCounter > 0) {
			System.out.println("Peynir eklediniz. (-100 TL)\n");
		setPrice(getPrice() - CHEESE_PRICE);
		System.out.println("An itibariyle pizza da bulunan peynir sayısı: " + --cheeseCounter);
		}
		else {
			System.out.println("Pizzanızda zaten peynir bulunmuyor.\n");
		}
	}
	
	public void eveSiparisVer () {
		System.out.println("Pizza evinize teslim edilecek. (+20 TL)\n");
		setPrice(getPrice() + 20);
		isDineIn = false;
	}
	
	public void fisAl () {
		System.out.println("\nSipariş bilgileri:");
		System.out.println((isVeggie ? "Vejetaryen pizza (300 TL)" : "Normal pizza (200 TL)"));
		System.out.println("Eklenen sos sayısı (her sos +50 TL): " + sauceCounter);
		System.out.println("Eklenen peynir sayısı (her peynir +100 TL): " + cheeseCounter);
		System.out.println("Eve teslimat? " + (isDineIn ? "Hayır." : "Evet."));
		System.out.println("Toplam ücret: " + getPrice() + " TL\n");
	}

	public boolean isVeggie() {
		return isVeggie;
	}

	public void setVeggie(boolean isVeggie) {
		this.isVeggie = isVeggie;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isDineIn() {
		return isDineIn;
	}

	public void setDineIn(boolean isDineIn) {
		this.isDineIn = isDineIn;
	}

	@Override
	public String toString() {
		return "Pizza [isVejetaryen=" + isVeggie + ", price=" + price + "]";
	}
	
}
