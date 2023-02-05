package lesson005;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n------------ODEV1-----------\n");
		//ödev1
		int[] array = { 1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8 };
		//Q43 -- kaçları saymak istiyorsak kullanıcıdan alalım
		System.out.println("Dizi içerisinde saydırmak istediğinizi sayıyı giriniz.");
		int saydir = scanner.nextInt();
		int counter = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == saydir) {
				counter++;
			}
		}
		if(counter > 0)
			System.out.println(counter + " adet " + saydir + " sayısı bulunuyor.");
		else
			System.out.println("Dizide " + saydir + " sayısı bulunmuyor.");
		System.out.println("\n------------ODEV2-----------\n");		
		//ödev2
		int nums[] = { 1, 13, 13, 13, 2, 5, 13, 1 };
		int max = 0;
		int max2 = 0;
		// bir dizide en büyük ikinci sayıyı bulan program
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] >= max) {
				max = nums[i];
			}
		}
		for(int i = 0; i <nums.length; i++) {
			if (nums[i] >= max2 && nums[i] < max) {
				max2 = nums[i];
			}
		}
		System.out.println("Dizideki en büyük ikinci sayı: " + max2);
		System.out.println("\n------------ODEV3-----------\n");
		//ödev3
		int nums2[] = { 1, 13, 5, 13, 2, 5, 7, 1 };
		// bir dizide eğer 13 var ise hem 13ü hem de bir sonraki indexi toplama işlemine almadan dizideki elemanların toplamı
		int sum = 0;
		for(int i = 0; i < nums2.length; i++) {
			if(nums2[i] != 13) {
				sum += nums2[i];
			}
			else {
				i+=1;
			}
		}
		System.out.println("Toplam: " + sum);
	}
}
