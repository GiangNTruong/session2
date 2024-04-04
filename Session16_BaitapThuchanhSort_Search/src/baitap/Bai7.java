package baitap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Integer[] arr = getArr();
        Arrays.sort(arr); // Sắp xếp mảng theo thứ tự tăng dần để sử dụng tìm kiếm nhị phân

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị tối thiểu: ");
        int min = scanner.nextInt();
        System.out.print("Nhập giá trị tối đa: ");
        int max = scanner.nextInt();

        int lowerIndex = findLowerIndex(arr, min);
        int upperIndex = findUpperIndex(arr, max);

        int count = upperIndex - lowerIndex + 1;

        System.out.println("Tìm thấy " + count + " số:");
        for (int i = lowerIndex; i <= upperIndex; i++) {
            System.out.println(arr[i]);
        }
    }

    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    private static int findLowerIndex(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int findUpperIndex(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
