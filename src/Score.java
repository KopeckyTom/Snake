import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {

    private static final int width = 515;
    private static final int height = 200;
    ImageIcon backGround = new ImageIcon("images//Score_Background.png");
    JLabel label = new JLabel();
    JLabel backGroundLabel = new JLabel();

    Score(){

        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(1050,0);
        this.setTitle("SCORE");



        label.setBounds(150,20,300,100);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Distant Galaxy", Font.BOLD, 60));
        label.setText("score: " + 0);
        this.add(label);

        backGroundLabel.setBounds(0,0,width,height);
        backGroundLabel.setIcon(backGround);
        this.add(backGroundLabel);
    }

    /**
     * This method sets text of the label
     * @param score
     */
    public void setScore(int score){
        label.setText("score: " + score);
    }




}
