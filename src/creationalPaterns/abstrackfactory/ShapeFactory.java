package creationalPaterns.abstrackfactory;
/**
 * <h1>ShapeFactory</h1>
 * 
 *  Bı factory classı {@link Shape} Interfacesinden kalıtım almış nesnelerin oluşturulması için kullanılır
 * 
 * @author mehmet
 * @version 1.0.0
 * @since 2019-06-23
 */
public class ShapeFactory {
	
	/**
	 * Kendisine pamametre olarak gelen {@code ShapeAbstarctFactory} interfacenin createShape methodunu çalıştırır
	 * @param factory 
	 * @return
	 * @apiNote testapinote
	 */
	public static Shape getShape(ShapeAbstarctFactory factory) {
		return factory.createShape();
	}
}
