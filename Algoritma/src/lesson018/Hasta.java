package lesson018;

public class Hasta implements Comparable<Hasta>{
	
	private String isim;
	private ESikayet sikayet;
	private String sikayet2;
	private int oncelik;

	public Hasta(String isim, String sikayet2) {
		super();
		this.isim = isim;
		this.sikayet2 = sikayet2;
		// oncelikBelirle(sikayet);

		this.oncelik = sikayet2.equalsIgnoreCase("Apandist") ? 1
				: sikayet2.equalsIgnoreCase("Yanık") ? 2 : sikayet2.equalsIgnoreCase("Agrı") ? 3 : 4;
	}

	public Hasta(String isim, ESikayet sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		oncelikBelirleEnum(sikayet);
	}

	public void oncelikBelirle(String sikayet) {
		if (sikayet.equalsIgnoreCase("Apandist")) {
			this.oncelik = 1;
		} else if (sikayet.equalsIgnoreCase("Yanık")) {
			this.oncelik = 2;
		} else {
			this.oncelik = 3;
		}
	}
	
	//ILLEGALGUMENTHATASI
	public void oncelikBelirleEnum(ESikayet sikayet) {
		switch (sikayet) {
		case APANDIST:
			this.oncelik = 1;
			break;
		case YANIK:
			this.oncelik = 2;
			break;
		case AGRI:
			this.oncelik = 3;
			break;

		default:
			throw new IllegalArgumentException("Beklenmedik değer girisi oldu");
		}
	}

	// Sİkayeti Enum tutalım

	// Array, ArrayList farkı
	// ArrayList, LinkedArraylist
	// Hashmap, LinkedHasmap farkı arka tarafta nasıl çalışıyorlar
	// Setler niye kullanılır, avantajları neler.

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

//	public String getSikayet() {
//		return sikayet;
//	}
//
//	public void setSikayet(String sikayet) {
//		this.sikayet = sikayet;
//	}

	public ESikayet getSikayet() {
		return sikayet;
	}

	public void setSikayet(ESikayet sikayet) {
		this.sikayet = sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	@Override
	public int compareTo(Hasta o) {
		if (o.getOncelik() > this.oncelik) {
			return -1;
		} else if (o.getOncelik() < this.oncelik) {
			return 1;
		}
		return 0;
	}
	
}
