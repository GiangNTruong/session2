import java.util.Scanner;

public class tonghieubac1 {
    /* Khi biết tổng vào hiệu tìm x và y */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tổng 2 số");
        float tong = sc.nextFloat();
        System.out.println("Mời nhập vào hiệu 2 số");
        float hieu = sc.nextFloat();
        // tính toán
        float x = (tong + hieu) / 2;
        float y = tong - x;

        // Xuất x,y
        System.out.println("x là" + x);
        System.out.println("y là" + y);
    }
}
