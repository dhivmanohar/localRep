package q4;

import java.util.Scanner;
/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Dhivya Manohar
 * @version 1.0
 */
public class Cube {
    /**
     * <p>The number is used in the surface area formula.</p>
     */
    public static final int CUBE_SIDES = 6;
    /**
     * <p>The number is used to cube the length of the cube.</p>
     */
    public static final int POWER_3 = 3;
    /**
     * <p>The number is used to square the length of the cube.</p>
     */
    public static final int POWER_2 = 2;
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int lengthCube;
        int volume;
        int surfaceArea;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter length of cube: ");
        lengthCube = scan.nextInt();
        
        scan.close();
        
        volume = (int) Math.pow(lengthCube, POWER_3);
        surfaceArea = (int) Math.pow(lengthCube, POWER_2) * CUBE_SIDES;
        
        
        System.out.println("Volume of cube = " + volume);
        System.out.println("Surface Area of cube = " + surfaceArea);
        
    }

};
