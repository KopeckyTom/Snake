import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreBoard extends JFrame implements ActionListener {
    FileRW fileRW = new FileRW();
    private static final int width = 500;
    private static final int height = 500;
    private static final int buttonWidth = 300;
    private static final int buttonHeight = 50;
    JButton back = new JButton();

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4= new JLabel();
    JLabel label5 = new JLabel();

    ImageIcon backGround = new ImageIcon("images//Menu_Background.png");
    JLabel backGroundLabel = new JLabel();

    ScoreBoard(){
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("SCOREBOARD");

        back.setBounds(100,370,buttonWidth,buttonHeight);
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

        label1.setBounds(200,0,300,50);
        label1.setText(fileRW.first());
        label1.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        label1.setForeground(Color.BLACK);
        this.add(label1);

        label2.setBounds(200,70,300,50);
        label2.setText(fileRW.second());
        label2.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        label2.setForeground(Color.BLACK);
        this.add(label2);

        label3.setBounds(200,140,300,50);
        label3.setText(fileRW.thrid());
        label3.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        label3.setForeground(Color.BLACK);
        this.add(label3);

        label4.setBounds(200,210,300,50);
        label4.setText(fileRW.fourth());
        label4.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        label4.setForeground(Color.BLACK);
        this.add(label4);

        label5.setBounds(200,280,300,50);
        label5.setText(fileRW.fifth());
        label5.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        label5.setForeground(Color.BLACK);
        this.add(label5);

        backGroundLabel.setBounds(0,0,width,height);
        backGroundLabel.setIcon(backGround);
        this.add(backGroundLabel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(back)){
            Menu menu = new Menu();
            this.dispose();


        }
    }
}

