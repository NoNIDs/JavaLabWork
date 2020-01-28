package chebanAD181;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyPanel extends JPanel {
    int randNumber;
    final Random random = new Random();
    MyPanel() {
        JLabel label1 =  new JLabel("Десятиричное число: ");
        JButton butGenerNumber = new JButton("Генерировать число");
        JLabel labelNumber =  new JLabel();
        JLabel label2 = new JLabel("Введите двоичное значение данного число: ");
        JTextField textField = new JTextField(30);
        JButton button = new JButton("Проверка");
        JLabel labelResult =  new JLabel();

        this.add(label1);

        butGenerNumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randNumber = random.nextInt(100);
                labelNumber.setText(String.valueOf(randNumber));
            }
        });
        this.add(labelNumber);
        this.add(butGenerNumber);
        this.add(label2);
        this.add(textField);
        this.add(button);
        this.add(labelResult);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().equals(Integer.toBinaryString(randNumber))) labelResult.setText("Верно");
                else labelResult.setText("Неверно");
            }
        });
    }
}
