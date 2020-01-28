package chebanAD181;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    Window() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Обучение перевода числа с десятичной в двоичную систему исчисления");
        MyPanel myPanel =  new MyPanel();
        //стандартное определение размера окна и его положения на экране в зависимости от расширения экрана
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width / 2 - 250, dimension.height / 2 - 100, 350, 200);
        this.add(myPanel);
    }
}
