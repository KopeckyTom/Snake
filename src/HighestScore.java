import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HighestScore extends JFrame {
    FileRW fileRW = new FileRW();
    private static final int width = 515;
    private static final int height = 200;
    Score score = new Score();
    ImageIcon backGround = new ImageIcon("images//Score_Background.png");
    JLabel label = new JLabel();
    JLabel backGroundLabel = new JLabel();

    HighestScore()  {

        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(1050,250);
        this.setTitle("HIGHESTSCORE");

        label.setBounds(135,20,300,100);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Distant Galaxy", Font.BOLD, 60));
        label.setText("record: " + 0);
        this.add(label);

        backGroundLabel.setBounds(0,0,width,height);
        backGroundLabel.setIcon(backGround);
        this.add(backGroundLabel);

    }

}