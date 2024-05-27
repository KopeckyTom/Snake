import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel {

    private static final int width = 49;
    private static final int height = 49;
    private int lastX;
    private int lastY;

    public Tile() {

    }

    Tile(int x, int y) {

        this.setSize(width, height);
        this.setLocation(x, y);
        this.setBackground(new Color(0, 0, 0));

    }

    public void setLastLocation(int x, int y) {

        this.lastX = x;
        this.lastY = y;

    }

    public int getLastX() {
        return lastX;
    }

    public int getLastY() {
        return lastY;
    }
}
