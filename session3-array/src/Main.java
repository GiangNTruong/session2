import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10};
        System.out.println("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i != X) {
                list.add(i);
            }
        }

        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }

        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
