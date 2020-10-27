package µÚ¾ÅÕÂ;

public class SimpleCircle2 {
	/** Main method */
	public static void main(String[] args) {
		// Create a circle with radius 1
				SimpleCircle2 circle1=new SimpleCircle2();
				System.out.println("The area of the circle of radius "+circle1.radius
						+" is "+circle1.getArea());
				
				// Create a circle with radius 25
				SimpleCircle2 circle2= new SimpleCircle2(25);
				System.out.println("The area of the circle of radius "+circle2.radius
						+" is "+circle2.getArea());
				
				// Create a circle with radius 125
						SimpleCircle2 circle3= new SimpleCircle2(125);
						System.out.println("The area of the circle of radius "+circle3.radius
								+" is "+circle3.getArea());
						
				//Modify circle radius
				circle2.radius=100;//or circle2.setRadius(100)
				System.out.println("The area of the circle of radius "+circle2.radius
						+" is "+circle2.getArea());

	}
	double radius;
	
	/** Construct a circle with radius 1*/
	SimpleCircle2(){
		radius=1;
	}
	
	/** Construct a circle with a specified radius */
	SimpleCircle2(double newRadius){
		radius=newRadius;
	}
	
	/** Return the area of the circle */
	double getArea() {
		return radius *radius *Math.PI;
	}
	
	/** Return the perimeter of the circle */
	double getPerimeter() {
		return 2 *radius *Math.PI;
	}
	
	/** Set a new radius for this circle*/
	void setRadius(double newRadius) {
		radius = newRadius;
	}

}
