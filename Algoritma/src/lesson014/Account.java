package lesson014;
import java.util.Scanner;
import java.util.Random;

public class Account {
	
	static Scanner scanner = new Scanner(System.in);
	
	private String accountNo;
	private int balance;
	private boolean krediBasvurusu;
	private int istenenKredi;
	private int krediBorcu;
	private boolean krediAlindiMi;
	private int nakitAvans;
	private int krediPuani;
	
	public Account() {
		this.accountNo = generateAccountNo(); 
	}
	
	public Account(int balance) {
		super();	
		this.balance = balance;
	}
	
	private String generateAccountNo() {
		Random random = new Random();
		return Long.toString(random.nextLong(10000000L,100000000L));		
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public int getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(int istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

	public int getKrediBorcu() {
		return krediBorcu;
	}

	public void setKrediBorcu(int krediBorcu) {
		this.krediBorcu = krediBorcu;
	}

	public boolean isKrediAlindiMi() {
		return krediAlindiMi;
	}

	public void setKrediAlindiMi(boolean krediAlindiMi) {
		this.krediAlindiMi = krediAlindiMi;
	}

	public int getNakitAvans() {
		return nakitAvans;
	}

	public void setNakitAvans(int nakitAvans) {
		this.nakitAvans = nakitAvans;
	}

	public int getKrediPuani() {
		return krediPuani;
	}

	public void setKrediPuani(int krediPuani) {
		this.krediPuani = krediPuani;
	}

	
	
}
