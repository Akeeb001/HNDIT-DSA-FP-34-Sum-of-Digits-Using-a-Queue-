package DSA;
import java.util.LinkedList;
import java.util.Queue;

public class SumOfDigit {   
	   
	    public static void main(String[] args) {
	    	    	
	    	 Queue<Integer> queue = new LinkedList<>();
	    	 
	    	 int input = 456; 
             
		        while (input > 0) {
		            int digit = input % 10;
		            queue.add(digit);
		            input /= 10; 
		        }
		        		     
		        int Sum = 0;
		        while (!queue.isEmpty()) {
		            Sum += queue.poll(); // Dequeue the digit and add it to the sum
		        }

	        System.out.println("Sum of digits is: " + Sum);
	    }
	}



