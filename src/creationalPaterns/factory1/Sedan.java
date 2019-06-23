package creationalPaterns.factory1;

public class Sedan implements Araba{

	@Override
	public void getTip() {
		System.out.println("Sedan çalıştı");
		return;
	}

}
