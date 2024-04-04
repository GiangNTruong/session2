package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập soos cần tìm : ");
        Scanner scanner=new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean founrd = search(num);
        if (!founrd){
            System.out.println("Không tìm thấy nó "+num+"trong mảng");

        }
    }
    private static boolean search(int num) {
        int[][] arr = getArr();
        List<Integer> rowPositions = new ArrayList<>();
        List<Integer> colPositions = new ArrayList<>();
        boolean found = false;

        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == num) {
                    rowPositions.add(i);
                    colPositions.add(j);
                    found = true;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < rowPositions.size(); i++) {
            System.out.println("Số " + num + " xuất hiện tại vị trí [" + rowPositions.get(i) + "][" + colPositions.get(i) + "]");
        }

        return found;
    }
    private static int [][] getArr(){
        int arr[][] = new int [20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int) (Math.random()*100);
            }
        }
        return arr;
    }
}
