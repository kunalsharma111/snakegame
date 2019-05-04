package snakegame;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Snakegame {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        Gameplay gameplay=new Gameplay();
        obj.setBounds(10, 10, 905, 700);
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obj.add(gameplay);
    
    }
    
}
