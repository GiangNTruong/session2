import java.util.Scanner;

public class TimMax {
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

        double max = matran[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matran[i][j] > max) {
                    max = matran[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất  " + max + "  vị trí " + maxRow + ", " + maxCol );
    }
}
