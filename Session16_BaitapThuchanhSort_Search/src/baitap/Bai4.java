package baitap;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập giá trị cần tìm");
        int x = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(arr,x);
        if (result!= -1){
            System.out.println("tìm thấy tại vị trí" + result);
        }else {
            System.out.println(" ko thấy");
        }
    }
    public static int binarySearch(int[] arr,int x){
        int left = 0;
        int right = arr.length -1;
        while (left<=right){
            int mid= left+(right-left)/2;
            if (arr[mid]==x){
                return mid;
            }else if (arr[mid]<x){
                return left=mid+1;
            }else right=mid+1;
        }
        return -1;
    }
}
