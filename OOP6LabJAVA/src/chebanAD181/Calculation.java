package chebanAD181;

public class Calculation {
    int number;
    int tempNumber;
    Calculation(int number) {
        this.number = number;
    }

    public void handler () {
        for(int i = number; i != 0; i--) {
            if(number % i == 0) {
                tempNumber = number / i;
                System.out.print(tempNumber + " ");
            }
        }
    }
}
