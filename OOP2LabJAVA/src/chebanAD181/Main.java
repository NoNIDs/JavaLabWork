package chebanAD181;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите кол-во товаров");
        Scanner scanner=new Scanner(System.in);
        int arraySize=scanner.nextInt();
        Cart cart = new Cart (arraySize);
        Item item = new Item();
        for (int i=0;i<arraySize;i++){
            System.out.println("Введите имя товара.");
            String nName=scanner.next();
            System.out.println("Введите стоимость товаров.");
            float nPrice=scanner.nextFloat();
            Item nItem = new Item(nPrice,nName);
            cart.addItem(nItem);
        }
        System.out.println("Сумма товаров в корзине - "+cart.Sum());
        System.out.println("Введите (1), если хотите поднять цену");
        System.out.println("Введите (2), если хотите понизить цену");
        Scanner Menu = new Scanner(System.in);
        int number = Menu.nextInt();
        System.out.println("Введите процент");
        Scanner Percent = new Scanner(System.in);
        float percent = Percent.nextInt();
        cart.changePrise(number, percent);//изменение цен(общей стоимости)
        cart.getInfo();//вывод информации о корзине в консоль
        System.out.println("Сумма товаров в корзине - "+cart.Sum());
        scanner.close();

    }
}

