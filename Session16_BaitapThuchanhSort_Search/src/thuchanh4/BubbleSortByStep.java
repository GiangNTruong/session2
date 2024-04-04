package thuchanh4;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước danh sách : ");
        int size = Integer.parseInt(scanner.nextLine());
        int [] list = new int[size];
        System.out.println("Nhập " + list.length + " giá trị :");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Danh sách đã nhập: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBắt đầu quá trình sắp xếp...");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Hoán đổi " + list[j] + " với " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Danh sách có thể đã được sắp xếp và không cần lần lặp tiếp theo");
                break;
            }
            System.out.print("Danh sách sau lần sắp xếp thứ " + i + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
