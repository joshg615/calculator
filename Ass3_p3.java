
package ass3_p3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ass3_p3 
{

    public static void main(String[] args) 
    {
        
        
        
                double input1, input2, calculation;
                String operator;
                boolean choice = true;
                String input3;
                Scanner keyboard = new Scanner(System.in);
                
                while (choice  == true)
                 {
                    System.out.println("Enter the first number: ");      
                    input1 = keyboard.nextDouble();
                    System.out.println("Enter an operator: ");
                    operator = keyboard.next();
                    System.out.println("Enter the second number: ");
                    input2 = keyboard.nextDouble();
                    
            
        
                    switch (operator)
                    {
                        case "+":
                        calculation = input1 + input2;
                        System.out.println(input1 + " " + operator + " " + input2 + " = " + calculation);
                        break;
                    
                        case "-":
                        calculation = input1 - input2;
                        System.out.println(input1 + " " + operator + " " + input2 + " = " + calculation);                      
                        break;
                    
                        case "/":
                            if (input2 == 0)
                                {
                                    System.out.println("That is an invalid calculation");
                                    break;
                                }
                            calculation = input1 / input2;
                            System.out.println(input1 + " " + operator + " " + input2 + " = " + calculation);
                            break;
                    
                        case "*":
                            calculation = input1 * input2;
                            System.out.println(input1 + " " + operator + " " + input2 + " = " + calculation);
                            break;
                        default :
                            System.out.println("That is not a valid operation");
                            break;
                    }    
                    
                    choice = false;
                    System.out.println("Do another (Enter y or Y for yes "
                                        + "and n or N for no)");
                    input3 = keyboard.next();
                    
                    if (input3.equalsIgnoreCase("y"))
                        choice = true;
                    else if (input3.equalsIgnoreCase ("n"))     
                        choice = false;
                        
                    }
                 
    }
                    
                       
                    
}
    
            


    

