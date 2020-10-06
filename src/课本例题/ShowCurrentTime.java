package ¿Î±¾ÀýÌâ;

public class ShowCurrentTime {
 public static void main(String[] args) {
	 //Obtain the total millseconds since midnight,jan 1,1970
	 long totalMillseconds = System.currentTimeMillis();
	 
	 //Obtain the total seconds since midnight,jan 1,1970
	 long totalSeconds = totalMillseconds/1000;
	 
	 //Computer the current second in the minute in the hour
	 long currentSecond = totalSeconds % 60;
	 
	 //Obtain the total minutes
	 long totalMinutes = totalSeconds / 60;
	 
	 //Computer the current minute in the hour
	 long currentMinute = totalMinutes % 60;
	 
	 //Obtain the total hours
	 long totalHours = totalMinutes / 60;
	 
	 //Computer the current hour
	 long currentHour = totalHours % 24;
	 
	 //Display results
	 System.out.println("Current time is " + currentHour +":"
	  + currentMinute + ":" + currentSecond + "GMT");
 }
}
