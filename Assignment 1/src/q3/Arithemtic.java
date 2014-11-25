package q3;

import java.util.Scanner;

/**
 * <p> This class prompts a user to input two numbers. The two number are
 * added, subtracted, divided and multiplied. Class displays the answer.  </p>
 *
 * @author Dhivya Manohar
 * @version 1.0
 */
public class Arithemtic {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */    
    public static void main(String[] args) {        
        double num1;
        double num2;
        double sum;
        double difference;
        double quotient;
        double product;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        num1 = scan.nextDouble();
        
        System.out.print("Enter the second number: ");
        num2 = scan.nextDouble();
        
        scan.close();
        
        sum = num1 + num2;
        difference = num1 - num2;
        quotient = num1 / num2;
        product = num1 * num2;
        
        
        System.out.println("Sum = " + sum);      
        System.out.println("Differnence = " + difference);
        System.out.println("Quotient = " + quotient);
        System.out.println("Product = " + product);
    }

};
