package chebanAD181;

public class LineSegment extends Point {
    Point p1;
    Point p2;
    //как аргументы принимает два обьекта класса Point, тобишь 1-2 точки
    LineSegment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    };

    //длина линии
    public double length() {
        double length = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
        return length;
    }
}
