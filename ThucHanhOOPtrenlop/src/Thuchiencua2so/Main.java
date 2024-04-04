package Thuchiencua2so;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calulator calulator=new Calulator();

        System.out.println("Nhập giá trị a");
        double a = input.nextDouble();
        System.out.println("Nhập giá trị b");
        double b = input.nextDouble();
        //Đặt giá trị cho 2 thuộc tính của đối tượng calculator
        calulator.setA(a);
        calulator.setB(b);
        //Hiển th các kết quả của phép toán
        System.out.println("Tổng 2 số là " + calulator.add());
        System.out.println("Hiệu 2 số là " + calulator.sub());
        System.out.println("Nhân 2 số là " + calulator.nulti());
        System.out.println("Chia 2 số là " + calulator.div());
    }
}
