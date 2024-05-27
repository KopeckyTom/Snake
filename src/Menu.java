import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    private static final int width = 500;
    private static final int height = 500;

    private static final int buttonWidth = 300;
    private static final int buttonHeight = 50;
    ImageIcon backGround = new ImageIcon("images//Menu_Background.png");
    JLabel backGroundLabel = new JLabel();

    JButton quit = new JButton();
    JButton play = new JButton();
    JButton scoreboardbutton = new JButton();

    Menu(){
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("MENU");


        quit.setBounds(100,300,buttonWidth,buttonHeight);
        quit.addActionListener(this);
        quit.setText("quit");
        quit.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        quit.setForeground(new Color(0, 0, 0));
        quit.setBackground(new Color(0, 0, 0));
        quit.setBorderPainted(true);
        quit.setContentAreaFilled(false);
        quit.setFocusPainted(false);
        quit.setBorder(new LineBorder(Color.BLACK));
        this.add(quit);

        play.setBounds(100,100,buttonWidth,buttonHeight);
        play.addActionListener(this);
        play.setText("play");
        play.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        play.setForeground(new Color(0, 0, 0));
        play.setBackground(new Color(0, 0, 0));
        play.setBorderPainted(true);
        play.setContentAreaFilled(false);
        play.setFocusPainted(false);
        play.setBorder(new LineBorder(Color.BLACK));
        this.add(play);

        scoreboardbutton.setBounds(100,200,buttonWidth,buttonHeight);
        scoreboardbutton.addActionListener(this);
        scoreboardbutton.setText("scoreboard");
        scoreboardbutton.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        scoreboardbutton.setForeground(new Color(0, 0, 0));
        scoreboardbutton.setBackground(new Color(0, 0, 0));
        scoreboardbutton.setBorderPainted(true);
        scoreboardbutton.setContentAreaFilled(false);
        scoreboardbutton.setFocusPainted(false);
        scoreboardbutton.setBorder(new LineBorder(Color.BLACK));
        this.add(scoreboardbutton);

        backGroundLabel.setBounds(0,0,width,height);
        backGroundLabel.setIcon(backGround);
        this.add(backGroundLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(play)){
            SelectChar selectChar = new SelectChar();
            this.dispose();


        }
        if (e.getSource().equals(quit)){

            this.dispose();


        }

        if (e.getSource().equals(scoreboardbutton)){

            ScoreBoard scoreBoard = new ScoreBoard();
            this.dispose();


        }

    }
}
