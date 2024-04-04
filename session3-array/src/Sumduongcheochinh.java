import java.util.Scanner;

public class Sumduongcheochinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột");
        int cols = Integer.parseInt(sc.nextLine());
        double[][] matran = new double[rows][cols];
        System.out.println("Nhập giá trị của ma trận");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("matran[%d][%d]", i, j);
                matran[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        int sum = 0 ;
        for (int i = 0; i < matran[0].length; i++) {
            for (int j = 0; j < matran[0].length; j++) {
                if (i==j){
                    System.out.printf("%.2f" , matran[i][j]);
                    sum += (int) matran[i][j];

                }
               else {
                    System.out.printf("%-3s","");
                }
            }
            System.out.println();
        }
        System.out.println("Tổng đường chéo chính là : " + sum);
    }
}
