package baitap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng : ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        System.out.println("nhập phần tử mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập giá trị cần tìm");
        int x = Integer.parseInt(scanner.nextLine());
        int result = linerSearch(arr,x);
        if (result!=-1){
            System.out.println("Giá trị" + x + " được tìm thấy tại vị trí "+ result);

        }else {
            System.out.println("Không tìm thấy giá trị trong mảng "+ x);
        }

    }

    public static int linerSearch(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
