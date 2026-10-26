package ua.opnu.list;
public class Main2 {
    public static void main(String[] args) {
        Point p = new Point();

        p.moveTo(16, 67);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}

interface Movable {
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();

    void moveTo(double x, double y);
}

class Point implements Movable
{
    private double x;
    private double y;
    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
}