package creationalPaterns.factory;

public class Lenovo implements Computer {

	@Override
	public double price(double fiyat) {
		System.out.println("Lenovo fiyat çalıştı");
		return 0;
	}

	@Override
	public String name(String name) {
		System.out.println("Lenovo name working");
		return null;
	}

}
