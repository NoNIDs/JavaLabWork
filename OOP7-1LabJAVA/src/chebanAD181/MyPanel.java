package chebanAD181;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

class MyPanel extends JPanel {
    MyPanel() {
        //создание элементов GUI
        JLabel label1 = new JLabel("Введите предложение: ");
        JTextField textField = new JTextField(30);
        JLabel label2 = new JLabel("Тут результат");
        JRadioButton butOper1 = new JRadioButton("Operation1");
        JRadioButton butOper2 = new JRadioButton("Operation2");
        JRadioButton butOper3 = new JRadioButton("Operation3");
        ButtonGroup buttonGroup =  new ButtonGroup();
        JButton myButton = new JButton("Обработка");
        //массив значений эл. myComboBox
        String [] itemsComboBox = {
                "на полянке",
                "в баре",
                "под вечер",
                "в подвале",
                "в машине"
        };

        JComboBox <String> myComboBox =  new JComboBox<String>(itemsComboBox);
        myComboBox.setSelectedItem(null);//первоначальный активный элемент null

        //добавление элементов в MyPanel
        this.add(label1);
        this.add(textField);

        this.add(butOper1);
        this.add(butOper2);
        this.add(butOper3);
        buttonGroup.add(butOper1);
        buttonGroup.add(butOper2);
        buttonGroup.add(butOper3);
        this.add(myComboBox);
        myComboBox.setVisible(false); //стандартно ComboBox не отображается
        this.add(myButton);
        this.add(label2);

        //myButton.addActionListener((ActionListener) new LogicOperation(textField, buttonGroup));

        //action - при выборе butOper3 происходит отображение myComboBox
        butOper3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myComboBox.setVisible(true);
            }
        });

        //action - определение активного элемента блока myComboBox
        final String[] valueCB = new String[1];//строка активного значения myComboBox
        myComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueCB[0] = (String) myComboBox.getSelectedItem();
            }
        });

        //action - myButton operations
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(butOper1.isSelected() == true) {
                    String wordEnd; //окончание существительных
                    StringBuilder tempStr = new StringBuilder(); //временная строка для сохранения значения окончания
                    String gender; //строка значения пола существительного
                    String []arrWord = textField.getText().split(" ");//split введенной строки
                    //создание значения окончания на основе введеного существительного
                    tempStr.append(arrWord[0].charAt(arrWord[0].length() - 2));
                    tempStr.append(arrWord[0].charAt(arrWord[0].length() - 1));
                    wordEnd = tempStr.toString();
                    //определение пола существительного
                    Gender genderOp = new Gender();
                    gender =  genderOp.getGender(wordEnd);
                    //переопределение значения существительного на определенное местоимение
                    switch (gender) {
                        case "null": {
                            arrWord[0] = "Я";break;
                        }
                        case "male": {
                            arrWord[0] = "Он";break;
                        }
                        case "female": {
                            arrWord[0] = "Она";break;
                        }
                        case "neuter": {
                            arrWord[0] = "Оно";break;
                        }
                        case "plural": {
                            arrWord[0] = "Они";break;
                        }
                    }
                    //concat результирующей строки и вывод в поле результата
                    String finalString = "";
                    for (int i = 0; i < arrWord.length; i++) {
                        finalString += arrWord[i] + " ";
                    }
                    label2.setText(finalString);
                }
                if(butOper2.isSelected() == true) {
                    String []arrWord = textField.getText().split(" ");
                    //создание копии arrWord[] с дп значением для переопределения строки(ex)
                    arrWord = Arrays.copyOf(arrWord, arrWord.length + 1);
                    arrWord[4] = arrWord[3];
                    arrWord[3] = arrWord[2];
                    arrWord[2] = "бы";
                    String finalString = "";
                    for (int i = 0; i < arrWord.length; i++) {
                        finalString += arrWord[i] + " ";
                    }
                    label2.setText(finalString);
                }
                if(butOper3.isSelected() == true) {
                    String []arrWord = textField.getText().split(" ");
                    //split строки активного значения myComboBox
                    String []arrWordComboBox = valueCB[0].split(" ");
                    arrWord[2] = arrWordComboBox[0];
                    arrWord[3] = arrWordComboBox[1];
                    String finalString = "";
                    for (int i = 0; i < arrWord.length; i++) {
                        finalString += arrWord[i] + " ";
                    }
                    label2.setText(finalString);
                }
            }
        });
    }
}
