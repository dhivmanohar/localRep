package q1;

import java.util.Scanner;
/**
 * <p>This class prompts a user to input a number and sorts that number in to
 * the different dollar bills and coins. There are 7 options: 10 dollar bill, 
 * 5 dollar bill, 2 dollar coin, quarters, dimes, nickles and pennies.</p>
 *
 * @author Dhivya Manohar
 * @version 1.0
 */
public class Change {
    /**
     * <p>The number to convert dollars to cents.<p>
     */
    public static final int CENTS = 100;
    /**
     * <p>The number to divide to determine how many 10 
     * dollar bills you need.</p>
     */
    public static final int DOLLARS_10 = 1000;
    /**
     * <p>The number to divide to determine how many 5 dollar 
     * bills you need.</p>
     */
    public static final int DOLLARS_5 = 500;
    /**
     * <p>The number to divide to determine how many 2 dollar 
     * coins you need.</p>
     */
    public static final int DOLLARS_2 = 200;
    /**
     * <p>The number to divide to determine how many quarters you need.</p>
     */
    public static final int QUARTERS = 25;
    /**
     * <p>The number to divide to determine how many dimes you need.</p>
     */
    public static final int DIMES = 10;
    /**
     * <p>The number to divide to determine how many nickles you need.</p>
     */
    public static final int NICKLES = 5;
    /**
     * <p>The number to divide to determine how many pennies you need.</p>
     */
    public static final int PENNIES = 1;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        double amount;
        int dollars10;
        int dollars5;
        int dollars2;
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter amount: ");
        amount = scan.nextDouble();
        
        scan.close();
        
        amount *= (int) CENTS;
        
        dollars10 = (int) (amount / DOLLARS_10);
        amount -= (dollars10 * DOLLARS_10);
        
        dollars5 = (int) (amount / DOLLARS_5);
        amount -= (dollars5 * DOLLARS_5);
        
        dollars2 = (int) (amount / DOLLARS_2);
        amount -= (dollars2 * DOLLARS_2);
        
        quarters = (int) (amount / QUARTERS);
        amount -= (quarters * QUARTERS);
        
        dimes = (int) (amount / DIMES);
        amount -= (dimes * DIMES);
        
        nickles = (int) (amount / NICKLES);
        amount -= (nickles * NICKLES);
        
        pennies = (int) (amount / PENNIES);
        amount -= (pennies * PENNIES);
        
        System.out.println(dollars10 + " ten dollar bills");
        System.out.println(dollars5 + " five dollar bills");
        System.out.println(dollars2 + " two dollar coin");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");
    }

};
