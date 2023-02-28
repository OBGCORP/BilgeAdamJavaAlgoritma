package lesson016.InterfaceOrnek;

public class Ucak extends Arac implements IUcabilir{

	@Override
	public void ilerle() {
		System.out.println("Ucak hareket ediyor.");		
	}

	@Override
	public void dur() {
		System.out.println("Ucak durdu.");		
	}

	@Override
	public void bin() {
		// TODO Auto-generated method stub

	}

	@Override
	public void uc() {

	}
}
