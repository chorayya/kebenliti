package ��11��;
import java.util.ArrayList;
import java.util.Scanner;
public class DistinctNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter integers (input end with 0):");
		int value;
		
		do {
			value = input.nextInt();//read a value from the input
			
			if(!list.contains(value)&&value!=0)
				list.add(value);//add the value if it is not in the list
			
		}while (value!=0);
		
		//display the distinct numbers
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");

	}

}
