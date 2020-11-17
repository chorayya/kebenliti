package ตฺ11ีย;

public class RectangleFromSimpleGeometricObject 
	extends SimpleGeometricObject{
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject() {
	}
	
	public RectangleFromSimpleGeometricObject(
			double width,double height) {
		this.width=width;
		this.height=height;
	}

	public RectangleFromSimpleGeometricObject(
			double width,double height,String color,boolean filled) {
		this.width=width;
		this.height=height;
		setColor(color);
		setFilled(filled);
		
	}
	
	/**return width*/
	public double getWidth() {
		return width;
	}
	
	/**set a new width*/
	public void setWidth(double width) {
		this.width=width;
	}
	
	/**return height*/
	public double getHeight() {
		return height;
	}
	
	/**set a new height*/
	public void setHeight(double Height) {
		this.height=height;
	}
	
	/**return area*/
	public double getArea() {
		return width*height;
	}
	
	/**return perimeter*/
	public double getPerimeter() {
		return 2*(width+height);
	}
	
	
	
	
	
	
}
