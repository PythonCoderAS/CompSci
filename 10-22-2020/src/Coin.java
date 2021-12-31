import java.awt.*;

public class Coin {
    private int isHead;
    private Image headImage, tailImage;

    public Coin(Image head, Image tail) {
        isHead = 1;
        headImage = head;
        tailImage = tail;
    }

    /* Flips this coin. If it's head, flips to tail, and if it's tail, flips to head. */
    public void flip() {
        isHead = (isHead + 1) % 2;
    }

    /* Draws the appropriate side of the coin */
    public void draw(Graphics g, int x, int y) {
        if (isHead == 1){
            g.drawImage(headImage, x, y, null);
        }
        else {
            g.drawImage(tailImage, x, y, null);
        }
    }
}
