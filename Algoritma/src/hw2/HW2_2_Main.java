package hw2;

public class HW2_2_Main {

	public static void main(String[] args) {
		TakimManager tm = new TakimManager();
		
		Takim takim1 = new Takim("barcelona");
		Takim takim2 = new Takim("real madrid");
		Takim takim3 = new Takim("sevilla");
		Takim takim4 = new Takim("liverpool");
		
		tm.macYap(takim1, takim2);
		tm.macYap(takim2, takim3);
		tm.macYap(takim3, takim4);
		tm.macYap(takim4, takim1);
		
		System.out.println("\n* * * * * * * *\n");
		
		tm.kasaGoster(takim1);
		tm.kasaGoster(takim2);
		tm.kasaGoster(takim3);
		tm.kasaGoster(takim4);
		
		System.out.println("\n* * * * * * * *\n");
		
		tm.takimiDiziyeEkle(takim1);
		tm.takimiDiziyeEkle(takim2);
		tm.takimiDiziyeEkle(takim3);
		tm.takimiDiziyeEkle(takim4);
		
		System.out.println("\n* * * * * * * *\n");
		
		tm.puanGoster(tm.getTakimlar());
		
		System.out.println("\n* * * * * * * *\n");
		
		tm.iflasEtmeDurumundakiTakimlar(tm.getTakimlar());
		
		System.out.println("\n* * * * * * * *\n");
		
		tm.sampiyonuGoster(tm.getTakimlar());
	}
}
