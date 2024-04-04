package ra.run;

import ra.bussinessImp.Product;

import java.util.*;

public class ProductManagement {
    private static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sản phẩm và nhập thông tin sản phẩm [15 điểm]\n" +
                    "2. Hiển thị thông tin các sản phẩm [15 điểm]\n" +
                    "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần [15 điểm]\n" +
                    "4. Xóa sản phẩm theo mã sản phẩm [10 điểm]\n" +
                    "5. Tìm kiếm sản phẩm theo tên sản phẩm [10 điểm]\n" +
                    "6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm [10 điểm]\n" +
                    "7. Thoát [05 điểm]\n");
            System.out.println("CHọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProductAll();
                    break;
                case 3:
                    sortProductByInterest();
                    break;
                case 4 :
                    removeProductById();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    changerStatus();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Nhập ko hợp lệ lại đi 1-7 : ");

            }
        }while (true);
    }
    public static void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập so sản phẩm muốn thêm : ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            Product product = new Product();
            product.inputData();
            productList.add(product);
        }
    }
    public static void displayProductAll(){
        for (Product product:productList){
            product.displayData();
        }
    }
    public static void sortProductByInterest(){
        Collections.sort(productList);
        System.out.println("Danh sách sau sắp xếp theo lợi nhuận ");
        displayProductAll();
    }

    public static void removeProductById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());

        boolean isDelete = productList.removeIf(product -> product.getProductid() == idDelete);

        if (isDelete) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không xóa đuợc ");
        }
    }

    public static void searchProductByName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm bạn muốn tìm : ");
        String searchNameProduct = scanner.nextLine();
        boolean found = false;
        for (Product product:productList){
            if (product.getProductName().contains(searchNameProduct)){
                product.displayData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có trong danh sách");
        }
    }

    public static void changerStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sản phẩm muốn thay đổi trạng thái");
        int idChangeProduct = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (Product product : productList){
            if (product.getProductid() == idChangeProduct){
                product.setProductStatus(!product.getProductStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có trong danh sách");
        }else {
            System.out.println("Thay đổi thành công");
        }
    }


}
