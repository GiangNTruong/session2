import java.util.Scanner;

public class gopPhanTU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Nhập X là số cần chèn:");
        int X = scanner.nextInt();

        System.out.println("Nhập vào vị trí index cần chèn X vào trong mảng:");
        int index = scanner.nextInt();

        if (index <= -1 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {

            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

