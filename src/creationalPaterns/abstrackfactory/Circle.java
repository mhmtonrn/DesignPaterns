package creationalPaterns.abstrackfactory;

public class Circle implements Shape{
	private double r;
	
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}

	@Override
	public double getSize() {
		return Math.PI*r;
	}
	
	public void setRadius(double r) {
		this.r = r;
	}

}
