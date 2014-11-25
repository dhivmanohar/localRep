package q2;

import java.util.Scanner;

/**
 * <p>This class prompts a user to input seconds and formats that seconds into
 * hours, minutes and seconds.</p>
 *
 * @author Dhivya Manohar
 * @version 1.0
 */
public class SecondsConvert {
    /**
    * <p>The number to divide to determine how many hours from seconds.</p>
    */
    public static final int HOURS = 60;
    /**
     * <p>The number to divide to determine how many minutes from seconds.</p>
     */
    public static final int MINUTES = 60;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int hours;
        int minutes;
        int secondsGiven;        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter seconds: ");
        secondsGiven = scan.nextInt();
        
        scan.close();
        
        minutes = secondsGiven / MINUTES;
        secondsGiven -= minutes * MINUTES;
        hours = minutes / HOURS;
        minutes -= hours * HOURS;
               
        
        
        System.out.println(hours + ":" + minutes + ":" + secondsGiven);        
    }

};
