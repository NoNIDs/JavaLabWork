package chebanAD181;

import javax.swing.*;
import java.awt.*;

public class RectRainbow extends JPanel {
    int x, y, width, height;
    Color color;

    public RectRainbow(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        //((Graphics2D) g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
        g.setColor(color);
        repaint();
    }
}