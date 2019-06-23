package creationalPaterns.factory;

import java.lang.reflect.InvocationTargetException;

public class ComputerFactory {
	public static Computer createComputerInstance(Class<?> c) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		return (Computer) c.getDeclaredConstructor().newInstance();
	}

}
