package Ra.manager;

import Ra.model.Product;

import java.util.Scanner;

public class ProductManager {
    private static Product[] products = new Product[100];
    private static int length = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("***********************MENU************************** \n" +
                    "1.\tNhập thông tin cho n sản phẩm (n nhập từ bàn phím) \n" +
                    "2.\tHiển thị thông tin các sản phẩm \n" +
                    "3.\tTính lợi nhuận các sản phẩm \n" +
                    "4.\tSắp xếp các sản phẩm theo lợi nhuận giảm dần \n" +
                    "5.\tThống kê các sản phẩm theo khoảng giá bán\n" +
                    "6.\tTìm các sản phẩm theo tên sản phẩm \n" +
                    "7.\tNhập sản phẩm \n" +
                    "8.\tBán sản phẩm \n" +
                    "9.\tCập nhật trạng thái sản phẩm theo mã SP\n" +
                    "10.\tXóa theo mã SP\n" +
                    "0 . Thoát\n");
            System.out.println("Mời lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    break;
            }
        }while (true);
    }
    public static void showAllProduct(){

    }
}
