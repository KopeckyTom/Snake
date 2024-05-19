import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectChar extends JFrame implements ActionListener{

    JButton continueButton = new JButton();
    JButton left = new JButton();
    JButton right = new JButton();
    JButton left1 = new JButton();
    JButton right1 = new JButton();
    JButton left2 = new JButton();
    JButton right2 = new JButton();
    List<ImageIcon> characters;
    List<ImageIcon> bodys;
    List<ImageIcon> foods;
    JLabel labelChar = new JLabel();
    JLabel labelBody = new JLabel();
    JLabel labelApple = new JLabel();
    ImageIcon character1 = new ImageIcon("images//head_1.png");
    ImageIcon character2 = new ImageIcon("images//head_2.png");
    ImageIcon character3 = new ImageIcon("images//head_3.png");
    ImageIcon character4 = new ImageIcon("images//head_4.png");
    ImageIcon body1 = new ImageIcon("images//body_1.png");
    ImageIcon body2 = new ImageIcon("images//body_2.png");
    ImageIcon body3 = new ImageIcon("images//body_3.png");
    ImageIcon body4 = new ImageIcon("images//body_4.png");
    ImageIcon apple1 = new ImageIcon("images//apple_1.png");
    ImageIcon apple2 = new ImageIcon("images//apple_2.png");
    ImageIcon apple3 = new ImageIcon("images//apple_3.png");
    //ImageIcon apple4 = new ImageIcon("images//apple_4.png");
    List<String> level = new ArrayList<>();
    JLabel labelLVL = new JLabel();
    private int currentLVL = 0;

    private int currentChar = 0;
    private int currentApple = 0;
    private static final int width = 500;
    private static final int height = 600;
    private static final int size = 50;

    SelectChar(){

        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("SELECT CHARACTER");

        labelChar.setIcon(character1);
        labelChar.setBounds(190,100,size,size);
        labelChar.setVisible(true);
        this.add(labelChar);

        labelBody.setIcon(body1);
        labelBody.setBounds(260,100,size,size);
        labelBody.setVisible(true);
        this.add(labelBody);

        labelApple.setIcon(apple1);
        labelApple.setBounds(225,200,size,size);
        labelApple.setVisible(true);
        this.add(labelApple);

        characters = new ArrayList<>();
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        characters.add(character4);

        bodys = new ArrayList<>();
        bodys.add(body1);
        bodys.add(body2);
        bodys.add(body3);
        bodys.add(body4);

        foods = new ArrayList<>();
        foods.add(apple1);
        foods.add(apple2);
        foods.add(apple3);
        //foods.add(apple4);

        level.add("easy");
        level.add("normal");
        level.add("hard");

        labelLVL.setText(level.get(currentLVL));
        labelLVL.setBounds(225,300,size+size,size);
        labelLVL.setFont(new Font("Distant Galaxy", Font.BOLD, 20));
        labelLVL.setVisible(true);
        labelLVL.setForeground(Color.BLACK);
        this.add(labelLVL);



        left.setBounds(100,100,size,size);
        left.addActionListener(this);
        left.setText("<");
        left.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        left.setForeground(new Color(0, 0, 0));
        left.setBackground(new Color(0, 0, 0));
        left.setBorderPainted(true);
        left.setContentAreaFilled(false);
        left.setFocusPainted(false);
        left.setBorder(new LineBorder(Color.BLACK));
        this.add(left);

        right.setBounds(350,100,size,size);
        right.addActionListener(this);
        right.setText(">");
        right.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        right.setForeground(new Color(0, 0, 0));
        right.setBackground(new Color(0, 0, 0));
        right.setBorderPainted(true);
        right.setContentAreaFilled(false);
        right.setFocusPainted(false);
        right.setBorder(new LineBorder(Color.BLACK));
        this.add(right);

        left1.setBounds(100,200,size,size);
        left1.addActionListener(this);
        left1.setText("<");
        left1.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        left1.setForeground(new Color(0, 0, 0));
        left1.setBackground(new Color(0, 0, 0));
        left1.setBorderPainted(true);
        left1.setContentAreaFilled(false);
        left1.setFocusPainted(false);
        left1.setBorder(new LineBorder(Color.BLACK));
        this.add(left1);

        right1.setBounds(350,200,size,size);
        right1.addActionListener(this);
        right1.setText(">");
        right1.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        right1.setForeground(new Color(0, 0, 0));
        right1.setBackground(new Color(0, 0, 0));
        right1.setBorderPainted(true);
        right1.setContentAreaFilled(false);
        right1.setFocusPainted(false);
        right1.setBorder(new LineBorder(Color.BLACK));
        this.add(right1);

        left2.setBounds(100,300,size,size);
        left2.addActionListener(this);
        left2.setText("<");
        left2.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        left2.setForeground(new Color(0, 0, 0));
        left2.setBackground(new Color(0, 0, 0));
        left2.setBorderPainted(true);
        left2.setContentAreaFilled(false);
        left2.setFocusPainted(false);
        left2.setBorder(new LineBorder(Color.BLACK));
        this.add(left2);

        right2.setBounds(350,300,size,size);
        right2.addActionListener(this);
        right2.setText(">");
        right2.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        right2.setForeground(new Color(0, 0, 0));
        right2.setBackground(new Color(0, 0, 0));
        right2.setBorderPainted(true);
        right2.setContentAreaFilled(false);
        right2.setFocusPainted(false);
        right2.setBorder(new LineBorder(Color.BLACK));
        this.add(right2);


        continueButton.setBounds(100,400,300,size);
        continueButton.addActionListener(this);
        continueButton.setText("continue");
        continueButton.setFont(new Font("Distant Galaxy", Font.BOLD, 30));
        continueButton.setForeground(new Color(0, 0, 0));
        continueButton.setBackground(new Color(0, 0, 0));
        continueButton.setBorderPainted(true);
        continueButton.setContentAreaFilled(false);
        continueButton.setFocusPainted(false);
        continueButton.setBorder(new LineBorder(Color.BLACK));
        this.add(continueButton);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(continueButton)){

            Game game = new Game();
            game.start();
            this.dispose();
            game.setFood(foods.get(currentApple));
            game.setCharacter(characters.get(currentChar));
            game.setBody(bodys.get(currentChar));
            game.setCurrentSpeed(currentLVL);
            game.timer.scheduleAtFixedRate(game.task,game.speed.get(game.getCurrentSpeed()),game.speed.get(game.getCurrentSpeed()));


        }
        if (e.getSource().equals(right)){

            currentChar++;
            currentChar %= characters.size();
            labelChar.setIcon(characters.get(currentChar));
            labelBody.setIcon(bodys.get(currentChar));
            this.repaint();

        }
        if (e.getSource().equals(left)){

            currentChar--;
            if (currentChar == -1){
                currentChar = characters.size()-1;
            }
            labelChar.setIcon(characters.get(currentChar));
            labelBody.setIcon(bodys.get(currentChar));
            this.repaint();

        }
        if (e.getSource().equals(right1)){

            currentApple++;
            currentApple %= foods.size();
            labelApple.setIcon(foods.get(currentApple));
            this.repaint();

        }
        if (e.getSource().equals(left1)){

            currentApple--;
            if (currentApple == -1){
                currentApple = foods.size()-1;
            }
            labelApple.setIcon(foods.get(currentApple));
            this.repaint();

        }

        if (e.getSource().equals(right2)){

            currentLVL++;
            currentLVL %= level.size();
            labelLVL.setText(level.get(currentLVL));
            this.repaint();

        }
        if (e.getSource().equals(left2)){

            currentLVL--;
            if (currentLVL == -1){
                currentLVL = level.size()-1;
            }
            labelLVL.setText(level.get(currentLVL));
            this.repaint();

        }



    }
}

