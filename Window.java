import javax.swing.*;
import utils.*;

public class Window{
    private int width = 400;
    private int height = 600;
    private String title = "Calculator";
    private JFrame frame;

    public Window(){
        frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(MyColors.background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /*
     * In this function we will add all the components to the frame.
     * Eg. Buttons, text field
     */
    public void populate(){
        // frame.add(button);
    }

    public void show(){
        frame.setVisible(true);
    }
}