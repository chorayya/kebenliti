package ตฺพลีย;

public class TotalArea {

	public static void main(String[] args) {
		//Declare circleArray
		CircleWithPrivateDataFields[] ciecleArray;
		
		//Create ciecleArray
		circleArray=createCircleArray();
		
		//print circlrArray and total areas of the circles
		printCircleArray(circleArray);
	}

	/**Create an array of Circle objects*/
	public static CircleWithPrivateDataFields[] createCiecleArray() {
		CircleWithPrivateDataFields[] ciecleArray=newCircleWithPrivateDataFields[5];
		
		for (int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
			
		}
		System.out.println("-------------------------------------");
		
		//compute and display the result
		System.out.printf("%-30s%-15f\n","The total area of ciecle is",sum(circleArray));
	}
	
	/**Add circle areas*/
	public static double sum(CircleWithPrivateDataFields[] ciecleArray) {
		//initialize sum
		double sum=0;
		
		//add areas to sum
		for(int i=0;i<circleArray.length;i++)
			sum+=circleArray[i].getArea;
		return sum;
	}
}
