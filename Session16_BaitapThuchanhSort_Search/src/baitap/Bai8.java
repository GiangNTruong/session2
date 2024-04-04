package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        System.out.print("Chuỗi tăng dần lớn nhất: ");
        System.out.println(new String(charArray));
    }
}
