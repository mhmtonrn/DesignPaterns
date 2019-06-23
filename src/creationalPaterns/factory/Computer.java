package creationalPaterns.factory;
/**
 * <h1>Computer Interface</h1>
 * @author mehmet
 * @version 1.0.0
 * @since 2019-06-23
 */

public interface Computer {
	/**
	 * this method get fiyat as a param or return param
	 * @param fiyat
	 * @return
	 */
	double price(double fiyat);
	/**
	 * for computers name
	 * @param name computer name
	 * @return  computer name
	 */
	String name(String name);
}
