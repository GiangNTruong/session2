import java.util.Scanner;

public class TongCot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số hàng của ma trận:");
        int rows = scanner.nextInt();

        System.out.println("Nhập số cột của ma trận:");
        int cols = scanner.nextInt();

        double[][] matran = new double[rows][cols];

        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matran[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Nhập thứ tự của cột muốn tính tổng:");
        int cotIndex = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matran[i][cotIndex];
        }

        System.out.println("Tổng các phần tử của cột " + cotIndex + " là: " + sum);
    }
}
