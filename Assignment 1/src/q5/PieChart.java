package q5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This class draws a a pie chart with 8 different colors.<p>
 *
 * @author Dhivya Manohar   
 * @version 1.0
 */

public class PieChart extends JFrame {
    /**
     * <p> version identifier for a serializable class.<p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;
    /**
     * <p>Number used for identifying position of circle.</p>
     */
    private static final int FIFTY = 50;
    /**
     * <p>Number used for identifying width & height of circle.</p>
     */
    private static final int EIGHTY = 80;
    /**
     * <p>Number used for identifying arc angle.</p>
     */
    private static final int FORTY_FIVE = 45;
    /**
     * <p>Number used for identifying start angle for arc.</p>
     */
    private static final int ARC_3 = 90;
    /**
     * <p>Number used for identifying start angle for arc.</p>
     */
    private static final int ARC_4 = 135;
    /**
     * <p>Number used for identifying start angle for arc.</p>
     */
    private static final int ARC_5 = 180;
    /**
     * <p>Number used for identifying start angle for arc. And
     * size of pie chart.</p>
     */
    private static final int ARC_6 = 225;
    /**
     * <p>Number used for identifying start angle for arc.</p>
     */
    
    private static final int ARC_7 = 270;
    /**
     * <p>Number used for identifying start angle for arc. And
     * size of pie chart.</p>
     */    
    private static final int ARC_8 = 315;
    

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public PieChart() {
        super("Cut the pie!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new PieChartPanel());
        setSize(ARC_8, ARC_6); 
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class PieChartPanel extends JPanel {

        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        

        /**
         * <p> version identifier for a serializable class.<p>
         */
        private static final long serialVersionUID = 1L;

        /**
         * <p>The default constructor that retrieves an image to draw.</p>
         */
        public PieChartPanel() {
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.green);
            g.setColor(Color.darkGray);
            g.drawString("COLOURFUL PIE", X_POSITION, Y_POSITION);
            
            
            g.setColor(Color.lightGray);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, 0, FORTY_FIVE);
            
            g.setColor(Color.magenta);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, FORTY_FIVE, FORTY_FIVE);
            
            g.setColor(Color.blue);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, ARC_3, FORTY_FIVE);
            
            g.setColor(Color.red);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, ARC_4, FORTY_FIVE);
            
            g.setColor(Color.cyan);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, ARC_5, FORTY_FIVE);
            
            g.setColor(Color.black);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, ARC_6, FORTY_FIVE);
            
            g.setColor(Color.white);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, ARC_7, FORTY_FIVE);
            
            g.setColor(Color.orange);
            g.fillArc(FIFTY, FIFTY, EIGHTY, EIGHTY, ARC_8, FORTY_FIVE);
            
        }
    }

    /**
     * <p>The main method.</p>
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        new PieChart();
    }

};
