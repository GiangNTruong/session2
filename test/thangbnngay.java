import java.util.Scanner;

public class thangbnngay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập 1 tháng bất kỳ");
        int thang = scanner.nextInt();
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("Thang" + thang + " Có 31 ngày");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Thang" + thang + " Có 30 ngày");
        } else if (thang == 2) {
            System.out.println("Mời nhap year");
            int year = scanner.nextInt();
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Thang " + thang + "Năm " + year + " Có 29 ngày");
            } else {
                System.out.println("Thang " + thang + "Năm " + year + " Có 28 ngày");
            }
        } else {
            System.out.println("Nhập thang linh tinh");
        }
    }
}
