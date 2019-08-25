import java.util.ArrayList;
import java.util.*;
public class quiz9 {
	
	    	public static void main(String[] args) {
	    		Scanner input = new Scanner(System.in);

	    		ArrayList<Double> list = new ArrayList<Double>();
	    		System.out.println("How many integer?");
	    		int number = input.nextInt();
	    		System.out.print("Enter an integers: ");
	    		for (int i = 0; i < number; i++) {
	    			list.add(input.nextDouble());
	    		}
	    		double sum = 0;
	    		for (int i = 0; i < list.size(); i++) {
	    			sum += list.get(i);
	    			}
	    		
	    		
	    		System.out.println("Sum is " + sum);
	                    double average = sum/number;
	                    System.out.println("Average is" + average);
	                    
	    	}
	} 
