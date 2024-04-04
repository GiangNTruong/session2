package Tonghop1.manager;



import Tonghop1.model.Product1;

import java.util.Arrays;
import java.util.Scanner;

public class ProductManager1 {
    private static Product1[] products = new Product1[100];
    private static int productCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập thông tin cho n sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo khoảng giá bán");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm theo mã SP");
            System.out.println("10. Xóa theo mã SP");
            System.out.println("0. Thoát");
            System.out.println("***************************************************");
            System.out.println("Vui lòng chọn một chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sản phẩm cần thêm: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        Product1 product = new Product1();
                        product.inputData(scanner, products);
                        products[productCount++] = product;
                    }
                    break;
                case 2:
                    for (int i = 0; i < productCount; i++) {
                        products[i].displayData();
                    }
                    break;

                case 3:
                    for (int i = 0; i < productCount; i++) {
                        float profit = products[i].calProfit();
                        System.out.println("Product ID: " + products[i].getProductid() + ", Profit: " + profit);
                    }
                    break;
                case 4:
                    Arrays.sort(products, 0, productCount, (p1, p2) -> Float.compare(p2.calProfit(), p1.calProfit()));
                    for (int i = 0; i < productCount; i++) {
                        products[i].displayData(); // Hiển thị dữ liệu sau khi sắp xếp
                    }
                    break;
                case 5:
                    System.out.println("Nhập khoảng giá từ: ");
                    float fromPrice = scanner.nextFloat();
                    System.out.println("Nhập khoảng giá đến: ");
                    float toPrice = scanner.nextFloat();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getExportPrice() >= fromPrice && products[i].getExportPrice() <= toPrice) {
                            products[i].displayData();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    scanner.nextLine(); // consume newline left-over
                    String name = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductName().equalsIgnoreCase(name)) {
                            products[i].displayData();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Nhập mã sản phẩm cần nhập: ");
                    scanner.nextLine(); // consume newline left-over
                    String productId = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductid().equals(productId)) {
                            System.out.println("Nhập số lượng sản phẩm cần nhập: ");
                            int quantity = scanner.nextInt();
                            products[i].setQuantity(products[i].getQuantity() + quantity);
                            break;
                        }
                    }
                    break;
                case 8:
                    System.out.println("Nhập tên sản phẩm cần bán: ");
                    scanner.nextLine(); // consume newline left-over
                    String productName = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductName().equalsIgnoreCase(productName) && products[i].isStatus()) {
                            System.out.println("Nhập số lượng sản phẩm cần bán: ");
                            int quantity = scanner.nextInt();
                            if (quantity <= products[i].getQuantity()) {
                                products[i].setQuantity(products[i].getQuantity() - quantity);
                            } else {
                                System.out.println("Số lượng sản phẩm không đủ để bán.");
                            }
                            break;
                        }
                    }
                    break;
                case 9:
                    System.out.println("Nhập mã sản phẩm cần cập nhật trạng thái: ");
                    scanner.nextLine(); // consume newline left-over
                    String id = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductid().equals(id)) {
                            products[i].setStatus(!products[i].isStatus());
                            break;
                        }
                    }
                    break;
                case 10:
                    System.out.println("Nhập mã sản phẩm cần xóa: ");
                    scanner.nextLine(); // consume newline left-over
                    String deleteId = scanner.nextLine();
                    for (int i = 0; i < productCount; i++) {
                        if (products[i].getProductid().equals(deleteId)) {
                            for (int j = i; j < productCount - 1; j++) {
                                products[j] = products[j + 1];
                            }
                            productCount--;
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

}