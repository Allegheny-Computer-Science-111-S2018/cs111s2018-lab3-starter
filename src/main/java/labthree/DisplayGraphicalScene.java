package labthree;

import java.util.Date;
import javax.swing.JFrame;

/**
 * This class uses another class to produce simple graphical output.
 * The program will display a small graphical scene.
 *
 * <p>Bugs: This program has no known bugs, but is missing code
 *
 * @author Gregory M. Kapfhammer and Janyl Jumadinova and Erica Knoll
 */

public class DisplayGraphicalScene {

  private static final int CANVAS_WIDTH = 600;
  private static final int CANVAS_HEIGHT = 400;

  public static void main(String[] args) {
    // create a JFrame that will have programmer's name and date
    JFrame window = new JFrame("Janyl Jumadinova " + new Date());
    // Add the drawing canvas and do necessary things to
    // make the window appear on the screen
    window.getContentPane().add(new PaintGraphicalScene());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // TODO: make the window visible on the computer screen

    // TODO: set the size of the window that the program displays

  }
}

