package Bai3;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint();
        System.out.println("Điểm di chuyển 1" +movablePoint1);
        MovablePoint movablePoint2=new MovablePoint(1.0f,2.0,4.0,2.0);
        System.out.println("Điểm di chuyển 2 " + movablePoint2);
        movablePoint1.setxSpeed(0.5f);
        movablePoint1.setySpeed(-1.0f);
        System.out.println("Diem di chuyen sau khi sua doi : "+movablePoint1);
        movablePoint2.move();
        System.out.println("Điểm di chuyển 2 sau khi di chuển" +movablePoint2);
    }
}
