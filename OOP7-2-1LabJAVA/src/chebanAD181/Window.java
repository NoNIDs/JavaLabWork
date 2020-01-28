package chebanAD181;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Window extends JFrame {
    Window() throws InterruptedException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        //стандартное определение размера окна и его положения на экране в зависимости от расширения экрана
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width / 2 - 250, dimension.height / 2 - 100, 350, 200);
        Color[] colorList = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA};

        int widthRect = Window.this.getWidth()/7;
        int heightRect = Window.this.getHeight()/7;

        while(true) {
            for(int i = 0, j = 0;  i < 7; i++, j-=heightRect) {
                RectRainbow rect =  new RectRainbow(0, j, widthRect, heightRect, colorList[i]);
                this.add(rect);
                Thread.sleep(60);
            }
        }
    }
}