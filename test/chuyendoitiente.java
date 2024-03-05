import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị tiền USD muốn quy đổi sang VND");
        double USD = sc.nextDouble();
        double VND = USD * 23000;
        System.out.println(VND);
    }
}
