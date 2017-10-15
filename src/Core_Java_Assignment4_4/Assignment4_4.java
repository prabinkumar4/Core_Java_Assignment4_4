package Core_Java_Assignment4_4;
import java.util.Scanner;

public class Assignment4_4 {

																	
	public static void main(String[] args) {													
		Scanner userInput = new Scanner(System.in);												
        System.out.print("\nEnter Any Integer : ");												
        long Input = userInput.nextLong();														
        long sum = 1;																			
        System.out.print("Divisors of " + Input + " = 1,");										
        for (long myLongVariable = 2; myLongVariable <= Math.sqrt(Input); myLongVariable++) {	
            if (Input % myLongVariable == 0) {													
                System.out.print(myLongVariable + ",");											
                if (myLongVariable != Input / myLongVariable) {									
                    System.out.print(Input / myLongVariable + ",");}							
                if (Input / myLongVariable == 0) {												
                    sum += myLongVariable;														
                } else {																		
                    sum += (myLongVariable + Input / myLongVariable);}							
            }																					
        }																						
        System.out.println("\nThe Aliquot Sum of " + Input + " is : " + sum);					
        userInput.close();																		
        if (sum == Input) {																		
            System.out.println("\n" + Input + " is a perfect number.");							
            new PerfectNumber();																
        } else {																				
            System.out.println("\n" + Input + " is not a perfect number."); }					
     }																							
}																								
