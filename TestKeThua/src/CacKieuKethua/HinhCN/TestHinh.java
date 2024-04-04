package CacKieuKethua.HinhCN;

import java.util.Scanner;

public class TestHinh {
    public static void main(String[] args) {
        int canh;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nập cạnh hinh vuong");
        canh = scanner.nextInt();
        Hinhvuong hv = new Hinhvuong(canh);
        System.out.println("Chu vi là " +hv.chuVi());
        System.out.println("Dien tich là" + hv.dienTich());
    }
}
