import javax.swing.*;
import utils.*;
import components.*;

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
        frame.setResizable(false);
        frame.setLayout(null);
    }

    /*
     * In this function we will add all the components to the frame.
     * Eg. Buttons, text field
     */
    public void populate(){
        // we're putting the width of the window because we 
        // need our text field to be the size of the window horizontally.
        TextField textField = new TextField(0,0,width);
        frame.add(textField.getJTextField());
        
    }

    public void show(){
        frame.setVisible(true);
    }
}