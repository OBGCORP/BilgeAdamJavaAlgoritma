package lesson024;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIslemler {
	static Scanner scanner = new Scanner(System.in);
	
	public void dosyaOlustur(File file) throws Exception{
		if(file.exists()) {
			throw new Exception("dosya zaten bulunuyor");
		}
		else {
			System.out.println("dosya oluşturuluyor");
			Thread.sleep(1000);
			file.createNewFile();
		}
	}
	
	public void menu() {

		int input = 0;
		do {
			System.out.println("0- çıkış");
			System.out.println("1- dosya yarat");
			System.out.println("2- metin ekle");
			input = Integer.parseInt(scanner.nextLine());
			switch(input) {
			case 1:
				try {
					dosyaOlustur(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					metinEkle(FileSabitler.file);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
		}while (input != 0);
		
	}
	
	public void metinEkle(File file) throws Exception {
		if(file.exists()) {
			System.out.println("Metin girin:");
			String text = scanner.nextLine();
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(file, true);
				fileWriter.write(text + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(fileWriter != null) {
					try {
						fileWriter.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}
		else {
			throw new Exception("Dosya Bulunamadı");
		}
	}
	
	public void dosyaOku(File file) throws Exception {
		if(file.exists()) {
			FileReader fileReader = null;
			String text = null;
			char char2;
			try {
				fileReader = new FileReader(file);
				for(int i = 0; i < fileReader.read()-1; i++) {
					char2 = (char) i;
					text += char2 + "\n";
					System.out.println(text);
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				if(fileReader != null) {
					try {
						fileReader.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}
		else {
			throw new Exception("Dosya Bulunamadı");
		}
	}
	public static void main(String[] args) {
		
	}
}
