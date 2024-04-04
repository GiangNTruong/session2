package Bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle(5.0,"red");
        System.out.println("Hinình tròn" +circle);
        System.out.println("Diện tích hình tròn :  "+ circle.getArea());
        Cylinder cylinder = new Cylinder(3.0,"white",8.0);
        System.out.println("Hình trụ " +cylinder);
        System.out.println("Thể tích hình trụ " +cylinder.getVolume());
    }

}