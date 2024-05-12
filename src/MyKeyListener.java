import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {

    private boolean up,down,left,right;

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    @Override
    public void keyTyped(KeyEvent e) {

        switch (e.getKeyChar()) {
            case 'w', 'W' -> {
                if (!down) {
                    up = true;
                    left = false;
                    right = false;
                }
            }
            case 's', 'S' -> {
                if (!up) {
                    down = true;
                    left = false;
                    right = false;
                }
            }
            case 'a', 'A' -> {
                if (!right) {
                    up = false;
                    down = false;
                    left = true;
                }
            }
            case 'd', 'D' -> {
                if (!left) {
                    up = false;
                    down = false;
                    right = true;
                }

            }

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

