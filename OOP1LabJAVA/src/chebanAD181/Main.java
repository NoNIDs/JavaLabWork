package chebanAD181;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();

        if(number%2==0) {
            if (number == 0) {
                System.out.print("Your number is 0!");
            } else {
                System.out.print("Your number is even!");
            }
        } else {
            System.out.print("Your number is odd!");
        }
    }
}
