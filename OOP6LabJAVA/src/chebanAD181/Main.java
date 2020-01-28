package chebanAD181;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Calculation calc = new Calculation(number);
        calc.handler();

        scanner.close();
    }
}
