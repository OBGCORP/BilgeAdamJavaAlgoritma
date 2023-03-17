package hw4;

import java.io.*;
import java.util.HashMap;

public class HWMars {

	public static File file = new File("C:\\Users\\obgun\\Desktop\\JavaWsUygulama\\Algoritma\\src\\hw4\\Mars.txt");
	
	public int satirSayisi(File file) {
		BufferedReader reader = null;
		int sayac = 0;
		try {
			reader = new BufferedReader(new FileReader(file));
			String okunan;	
			while((okunan = reader.readLine()) != null) {
				sayac++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(reader.readLine() != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sayac;
	}
	
	public int kelimeSayisi(File file) {
		BufferedReader reader = null;
		int sayac = 0;
		try {
			reader = new BufferedReader(new FileReader(file));
			String okunan;	
			while((okunan = reader.readLine()) != null) {
				sayac += okunan.split(" ").length;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(reader.readLine() != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sayac;
	}
	
	public int karakterSayisi(File file) {
		BufferedReader reader = null;
		int sayac = 0;
		try {
			reader = new BufferedReader(new FileReader(file));
			String okunan;	
			while((okunan = reader.readLine()) != null) {
				sayac += okunan.replace(" ", "").length();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(reader.readLine() != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sayac;
	}
	
	public String enCokTekrarEdenKelime(File file) {
		BufferedReader reader = null;
		HashMap<String, Integer> kelimeler = new HashMap<>();
		try {
			reader = new BufferedReader(new FileReader(file));
			String okunan;	
			while((okunan = reader.readLine()) != null) {
				String[] okunanKelime = okunan.split(" ");
				for(String kelime : okunanKelime) {
					kelime = kelime.toLowerCase();
					if(kelime.endsWith(".") || kelime.endsWith(",") || kelime.endsWith("!") || kelime.endsWith(";")) {
						kelime = kelime.substring(0, kelime.length() - 1);
					}
				}
				for(String kelime : okunanKelime) {
					if(kelimeler.containsKey(kelime)) {
						kelimeler.put(kelime, kelimeler.get(kelime) + 1);
					}
					else {
						kelimeler.put(kelime, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(reader.readLine() != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int max = 0;
		String result = "";
		for(String kelime : kelimeler.keySet()) {
			if(kelimeler.get(kelime) >= max && !kelime.equals("")) {
				max = kelimeler.get(kelime);
				result = kelime;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		HWMars mars = new HWMars();
		System.out.println(mars.satirSayisi(file));
		System.out.println(mars.kelimeSayisi(file));
		System.out.println(mars.karakterSayisi(file));
		System.out.println(mars.enCokTekrarEdenKelime(file));
	}
}
