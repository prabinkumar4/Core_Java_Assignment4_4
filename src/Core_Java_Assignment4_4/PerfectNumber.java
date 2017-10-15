package Core_Java_Assignment4_4;

public class PerfectNumber {
																						
    public PerfectNumber() {												
        int myInteger, sum = 1;												
        System.out.print("Perfect Numbers between 1 to 100 are 1,");		
        for (int integerRange = 2; integerRange <= 100; integerRange++)		
        {sum = 1;															
            for (myInteger = 2; myInteger < integerRange; myInteger++)		
            {if (integerRange % myInteger == 0)								
                    sum = sum + myInteger;}									
            if (integerRange == sum)										
                System.out.print(integerRange + ",");}						
        return;																
    }																		
}																			