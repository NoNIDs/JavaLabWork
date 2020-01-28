package chebanAD181;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();//обьект рандомайзер
        ArrayList<Integer> arrNum = new ArrayList<>();//Коллекция рандомных целых чисел
        for(int i = 0; i < 100; i++) {
            arrNum.add(random.nextInt(2001) - 1000);//значения от -1000 до 1000
        }
        int tempNum;
        for(int i = 0; i < 100 - 1; i++) {
            for(int j = 0; j < 100 - i - 1; j++) {
                if(arrNum.get(j) > arrNum.get(j+1)) {
                    tempNum = arrNum.get(j);
                    arrNum.set(j, arrNum.get(j+1));
                    arrNum.set(j+1, tempNum);
                }
            }
        }
        for(Integer arr : arrNum) {
            System.out.print(arr + " ");
        }
    }
}
