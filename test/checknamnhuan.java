import java.util.Scanner;

public class checknamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 năm dương lịch");
        int nam = sc.nextInt();
        if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)) {
            System.out.println("Năm " + nam + " Là năm nhuận");
        } else {
            System.out.println("Năm" + nam + " Không phải là năm nhuận");
        }

    }

}
