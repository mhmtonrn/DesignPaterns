package creationalPaterns.factory;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Computer lenovo = (Lenovo)ComputerFactory.createComputerInstance(Lenovo.class);
		lenovo.name(null);
	}

}
