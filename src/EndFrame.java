import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndFrame extends JFrame implements ActionListener {

    private static final int width = 500;
    private static final int height = 500;
    private static final int buttonWidth = 300;
    private static final int buttonHeight = 50;
    ImageIcon backGround = new ImageIcon("images//Menu_Background.png");
    JLabel backGroundLabel = new JLabel();
    JButton restart = new JButton();
    JButton back = new JButton();
    JButton quit = new JButton();

    EndFrame(){
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("GAME OVER");

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

        restart.setBounds(100,100,buttonWidth,buttonHeight);
        restart.addActionListener(this);
        restart.setText("restart");
        restart.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        restart.setForeground(new Color(0, 0, 0));
        restart.setBackground(new Color(0, 0, 0));
        restart.setBorderPainted(true);
        restart.setContentAreaFilled(false);
        restart.setFocusPainted(false);
        restart.setBorder(new LineBorder(Color.BLACK));
        this.add(restart);

        back.setBounds(100,200,buttonWidth,buttonHeight);
        back.addActionListener(this);
        back.setText("back");
        back.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        back.setForeground(new Color(0, 0, 0));
        back.setBackground(new Color(0, 0, 0));
        back.setBorderPainted(true);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);
        back.setBorder(new LineBorder(Color.BLACK));
        this.add(back);

        backGroundLabel.setBounds(0,0,width,height);
        backGroundLabel.setIcon(backGround);
        this.add(backGroundLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(restart)){
            SelectChar selectChar = new SelectChar();
            this.dispose();


        }
        if (e.getSource().equals(quit)){

            this.dispose();


        }
        if (e.getSource().equals(back)){
            Menu menu = new Menu();
            this.dispose();


        }

    }
}
