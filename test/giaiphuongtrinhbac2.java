import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào hệ số a");
        double a = sc.nextDouble();
        System.out.println("Mời nhập vào hệ số b");
        double b = sc.nextDouble();
        System.out.println("Mời nhập vào hệ số c");
        double c = sc.nextDouble();
        // tính delta
        double delta = b * b - (4 * a * c);
        // Kiểm tra điều kiện
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt : ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
