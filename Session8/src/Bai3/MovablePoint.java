package Bai3;

public class MovablePoint extends  Point{
    private double xSpeed;
    private double ySpeed;
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed=0.0f;
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move(){
        double newX = getX()+xSpeed;
        double newY = getY()+ySpeed;
        setXY(newX,newY);
        return this;
    }
}
