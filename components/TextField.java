package components;

import java.awt.Color;

import javax.swing.JTextField;

public class TextField {
    private int width,height;
    private int x,y; // location on window
    private Color backgroundColor;
    private JTextField textField;
    
    public TextField(int x, int y, int width){
        textField = new JTextField();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = 50;

        textField.setBounds(x,y,width,height);
    }

    public JTextField getJTextField(){
        return textField;
    }
}
