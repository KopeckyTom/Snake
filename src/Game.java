import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Timer;

public class Game extends JFrame  {
    HighestScore highestScore = new HighestScore();
    JLabel labelChar = new JLabel();
    JLabel  labelFood = new JLabel();
    List<Tile> body = new ArrayList<>();
    private static final int width = 1014;
    private static final int height = 1038;
    private static final int tilesY = 20;
    private static final int tilesX = 20;
    private static final int tilesSizeX = 50;
    private static final int tilesSizeY = 50;
    private static final int jump = 50;
    private int currentSpeed;
    MyKeyListener myKeyListener = new MyKeyListener();
    JPanel panelBody = new JPanel();
    List<Tile> tiles = new ArrayList<>();
    Timer timer = new Timer();
    Random r = new Random();
    Tile head = new Tile();
    Tile apple = new Tile();
    ImageIcon bodyImage;
    JLabel labelBody;
    private int scorePoints = 0;
    List<Integer> speed = new ArrayList<>();

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            update();
        }
    };
    Game(){


        speed.add(250);
        speed.add(170);
        speed.add(120);

        labelChar.setBounds(0,0,tilesSizeX,tilesSizeY);
        labelFood.setBounds(0,0,tilesSizeX,tilesSizeY);

        panelBody.setBounds(0,0,width,height);
        panelBody.setOpaque(false);
        panelBody.setLayout(null);
        this.add(panelBody);

        panelBody.add(head);
        panelBody.add(apple);

        this.setSize(width,height);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground( new Color(	63,191,0) );
        this.setLayout(null);
        this.addKeyListener(myKeyListener);
        this.setTitle("SNAKE");


        for (int i = 0; i < tilesY;i++){
            for (int j = 0; j < tilesX;j++){

                ImageIcon grass1 = new ImageIcon("images//grass_1.png");
                ImageIcon grass2 = new ImageIcon("images//grass_2.png");
                ImageIcon grass3 = new ImageIcon("images//grass_3.png");
                ImageIcon grass4 = new ImageIcon("images//grass_4.png");

                JLabel labelGrass = new JLabel();

                int grass = r.nextInt(4);
                switch (grass){
                    case 0:
                        labelGrass.setIcon(grass1);
                        break;
                    case 1:
                        labelGrass.setIcon(grass2);
                        break;
                    case 2:
                        labelGrass.setIcon(grass3);
                        break;
                    case 3:
                        labelGrass.setIcon(grass4);
                        break;
                }

                Tile tile = new Tile(i*tilesSizeX,j*tilesSizeY);
                tile.setOpaque(false);
                tile.add(labelGrass);
                tiles.add(tile);
                this.add(tile);
                this.repaint();

            }
        }

        head.setLayout(null);
        head.add(labelChar);
        head.setOpaque(false);

        apple.setLayout(null);
        apple.add(labelFood);
        apple.setOpaque(false);

    }

    /**
     *  This method sets starting position of head and apple
     */
    public void start(){

        head.setBounds(tiles.get(r.nextInt(tiles.size())).getBounds());
        apple.setBounds(tiles.get(r.nextInt(tiles.size())).getBounds());

    }

    /**
     * This method moves the head of the snake and sets location of the head before the move and calling other methods
     */
    public void update(){

        head.setLastLocation(head.getLocation().x,head.getLocation().y);


        for (int i = 0; i < body.size();i++){

            body.get(i).setLastLocation(body.get(i).getLocation().x,body.get(i).getLocation().y);

        }
        if (myKeyListener.isUp()){
            head.setLocation(head.getX(),head.getY() - jump);
            this.repaint();
        }
        if(myKeyListener.isDown()){
            head.setLocation(head.getX(),head.getY() + jump);
            this.repaint();
        }
        if(myKeyListener.isLeft()){
            head.setLocation(head.getX() - jump, head.getY());
            this.repaint();
        }
        if(myKeyListener.isRight()){
            head.setLocation(head.getX() + jump, head.getY());
            this.repaint();
        }

        if (!body.isEmpty()){
            bodyPartMove();
        }
        if (head.getLocation().equals(apple.getLocation())){
            nextScore();
        }

        end();
    }

    /**
     * This method sets image of the apple
     * @param food
     */
    public void setFood(ImageIcon food){

        labelFood.setIcon(food);

    }

    /**
     * This method sets image of the head
     * @param character
     */
    public void setCharacter(ImageIcon character){

        labelChar.setIcon(character);

    }

    /**
     * This method sets image of the body
     * @param body
     */
    public void setBody(ImageIcon body){

        bodyImage = new ImageIcon(body.getImage());

    }

    /**
     * This method gets the value of the int
     * @return
     */
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * This method sets the value of the int
     * @param currentSpeed
     */
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    /**
     * This method spawns new apple and sets new current score
     */
    public void newApple(){
        scorePoints++;
        highestScore.score.setScore(scorePoints);
        boolean done = true;
        apple.setLocation(tiles.get(r.nextInt(tilesX * tilesY)).getLocation());
        if (!body.isEmpty()) {
            while (done) {
                for (int i = 0; i < body.size(); i++) {
                    if (body.get(i).getLocation().equals(apple.getLocation())) {
                        apple.setLocation(tiles.get(r.nextInt(tilesX * tilesY)).getLocation());
                    }else{
                        done = false;
                    }
                }
            }
        }
    }

    /**
     * This method spawns new body part
     */
    public void nextScore(){

        newApple();

        labelBody = new JLabel();
        labelBody.setBounds(0,0,tilesSizeX,tilesSizeY);
        labelBody.setIcon(bodyImage);
        Tile bodyPart = new Tile();
        bodyPart.setOpaque(false);

        if (body.isEmpty()){
            bodyPart.setBounds(head.getX(), head.getLastY(), tilesSizeX,tilesSizeY);
        }else {
            bodyPart.setBounds(body.get(body.size()-1).getLastX(),body.get(body.size()-1).getLastY(),tilesSizeX,tilesSizeY);
        }

        body.add(bodyPart);
        bodyPart.add(labelBody);

        panelBody.add(bodyPart);

    }

    /**
     * This method detects when it is end of the game
     */
    public void end(){
        if (body.size()>2){
            for (int i = 0; i < body.size(); i++) {
                if (head.getLocation().equals(body.get(i).getLocation())) {
                    this.dispose();
                    highestScore.fileRW.writeScore(scorePoints);
                    highestScore.score.dispose();
                    highestScore.dispose();
                    timer.cancel();
                    EndFrame endFrame = new EndFrame();
                }
            }
        }

        if (head.getX() >= width-50 || head.getX() < 0 || head.getY() >= height-50 || head.getY() < 0){
            this.dispose();
            highestScore.fileRW.writeScore(scorePoints);
            highestScore.score.dispose();
            highestScore.dispose();
            timer.cancel();
            EndFrame endFrame = new EndFrame();
        }

        if (scorePoints == 399){
            this.dispose();
            highestScore.fileRW.writeScore(scorePoints);
            highestScore.score.dispose();
            highestScore.dispose();
            timer.cancel();
            EndFrame endFrame = new EndFrame();
        }
    }

    /**
     * This method moves the body parts
     */
    public void bodyPartMove(){
        body.get(0).setLocation(head.getLastX(), head.getLastY());
        for (int i = 1; i < body.size();i++){

            body.get(i).setLocation(body.get(i-1).getLastX(),body.get(i-1).getLastY());

        }
        panelBody.repaint();
    }

    /**
     * This method gets value of the int
     * @return
     */
    public int getScorePoints() {
        return scorePoints;
    }

    /**
     * This method sets value of the int
     * @param scorePoints
     */

    public void setScorePoints(int scorePoints) {
        this.scorePoints = scorePoints;
    }
}
