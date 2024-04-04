import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array1 = new int[3];
        int[] array2 = new int[4];


        System.out.println("Nhập giá trị cho mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập giá trị cho mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }


        int[] array3 = new int[array1.length + array2.length];


        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }


        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }


        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
    }
}
