package creationalPaterns.factory1;

public class ArabaFactory {
	public static Araba cretaAraba(ArabaTip tip) {
		switch (tip) {
		case Sedan:
			return new Sedan();
		case Hatchback:
			return new Hatchback();
		default:
			return null;
		}
	}
}
