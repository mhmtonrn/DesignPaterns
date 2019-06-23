package creationalPaterns.factory1;

public class Main {
	public static void main(String[] args) {
		Sedan s = (Sedan) ArabaFactory.cretaAraba(ArabaTip.Sedan);
		s.getTip();
	}
}
