package chebanAD181;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter x coordinate first point: ");
	    float x1 = scanner.nextFloat();
        System.out.println("Enter y coordinate first point: ");
        float y1 = scanner.nextFloat();
        Point p1 =  new Point(x1, y1); //создание точки 1

        System.out.println("Enter x coordinate second point: ");
        float x2 = scanner.nextFloat();
        System.out.println("Enter y coordinate second point: ");
        float y2 = scanner.nextFloat();
        Point p2 = new Point(x2, y2); //создание точки 2

        LineSegment line = new LineSegment(p1, p2); //создание обьекта "линия"

        System.out.println("Length of line = " + line.length());

    }
}
