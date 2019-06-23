package creationalPaterns.abstrackfactory;

public class Rectangle implements Shape{
	private double s;
	
	@Override
	public double getArea() {
		return Math.PI*s*s;
	}

	@Override
	public double getSize() {
		return Math.PI*s;
	}
	
	public void setHeight(double s) {
		this.s = s;
	}

}
