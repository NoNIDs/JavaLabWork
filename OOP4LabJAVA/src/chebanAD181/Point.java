package chebanAD181;

public class Point {
    float x;
    float y;
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    };
    public Point() {}; //для работы конструктора LineSegment

    //getters
    public float getX() { return x; };
    public float getY() { return y; };
}
