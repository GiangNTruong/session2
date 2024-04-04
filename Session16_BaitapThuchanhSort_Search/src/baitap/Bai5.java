package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Integer[] arr = getArr();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mảng ngẫu nhiên: " + Arrays.toString(arr));

        System.out.print("Nhập giá trị nhỏ nhất: ");
        int min = scanner.nextInt();

        System.out.print("Nhập giá trị lớn nhất: ");
        int max = scanner.nextInt();

        int count = 0;
        System.out.println("Chi tiết về các số được tìm thấy:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println("Số lượng phần tử tìm thấy: " + count);
    }

    private static Integer[] getArr(){
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
    private static int[] binarySearch(Integer[] arr, int min, int max) {
        int left = 0;
        int right = arr.length - 1;
        int lowerBound = -1;
        int upperBound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= min) {
                upperBound = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= max) {
                lowerBound = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{lowerBound, upperBound};
    }

}
