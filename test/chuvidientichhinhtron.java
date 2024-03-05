import java.util.Scanner;

public class chuvidientichhinhtron {
    public static void main(String[] args) {
        // Tính chi vi , diện tích hình tròn
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính r : ");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi là" + cv);
        System.out.println("Diện tích là" + dt);
    }

}