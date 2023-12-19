package components;

import javax.swing.*;
import java.awt.*;
import utils.*;

public class Button {
    private JButton button;
    private Color color = MyColors.background;
    private int width = 50;
    private int height = 10;
    private int x, y;

    public Button(int x, int y) {
        this.x = x;
        this.y = y;
        button = new JButton();
        button.setBounds(x, y, width, height);
        button.setBackground(color);
        button.setBounds(x, y, width, height);
    }

    /*
     * public void setLocation(int x, int y, int width, int height) {
     * this.x = x;
     * this.y = y;
     * this.width = width;
     * this.height = height;
     * button.setBounds(x, y, width, height);
     * 
     * }
     */

    public JButton getButton() {
        return button;
    }

}
