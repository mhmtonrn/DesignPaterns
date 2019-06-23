package creationalPaterns.factory;

public class Mac implements Computer {

	@Override
	public double price(double fiyat) {
		System.out.println("Mac price working");
		return 0;
	}

	@Override
	public String name(String name) {
		System.out.println("Mac name working");
		return null;
	}

}
