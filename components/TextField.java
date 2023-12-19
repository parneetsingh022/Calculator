package components;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JTextField;
import utils.*;

public class TextField {
    private int width,height;
    private int x,y; // location on window
    private JTextField textField;
    private Font font = new Font("Arial", Font.BOLD,20);
    private int margin = 10;
 

    public TextField(int x, int y, int width) {
        textField = new JTextField();
        this.x = x + margin;
        this.y = y;
        this.width = width - 4*margin;
        this.height = 50;
        
        textField.setBounds(this.x,this.y,this.width,this.height);
        textField.setFont(font);
        textField.setForeground(new Color(255,255,255));
        textField.setBackground(MyColors.background);
        textField.setBorder(null);
        

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char typed = e.getKeyChar();
                if(!((typed >= '0' && typed <= '9') || typed == '\b')){
                    e.consume();
                }
            }
        });

    }

    public JTextField getJTextField() {
        return textField;
    }
}