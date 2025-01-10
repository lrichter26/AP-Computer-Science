package CelebrityGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI implements ActionListener {
    private JFrame frame;
    public GUI () {
        frame = new JFrame("My app");
        frame.setSize(0, 0);
        frame.setLayout(null);
    }
    public GUI (int width, int height) {
        frame = new JFrame("My app");
        frame.setSize(width, height);
        frame.setLayout(null);
    }
    public static void main(String[] args) {
        GUI window = new GUI(300, 300);
        JLabel hint = new JLabel();
        JButton submit = new JButton("Enter");
        submit.addActionListener(window);
        window.frame.add(hint);
        window.frame.add(submit);
        
    }
    
    
    public void addButton(String text) {
        JButton button = new JButton(text);
        frame.add(button);
    }
    public void addLabel(String text) {
        JLabel label = new JLabel(text);
        frame.add(label);
    }
    public void setVisible() {
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
