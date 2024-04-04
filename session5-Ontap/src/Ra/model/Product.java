package Ra.model;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Product {
    private String productid;
    private String 	productName;
    private float importPrice;
    private float exportPrice;
    private float profit ;
    private int quantity;
    private String descriptions;
    private Boolean status;

    public Product() {
    }

    public Product(String productid, String productName, float importPrice, float exportPrice, float profit, int quantity, String descriptions, Boolean status) {
        this.productid = productid;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.profit = calProfit();
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
    }
    public float calProfit(){
       return this.exportPrice-this.importPrice;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public void inputData(Scanner scanner,Product[] arrProduct,int length){
        System.out.println("Nhập id sản phẩm");
        do {
            productid = scanner.nextLine();
            if (!(productid.startsWith("P") && productid.length() == 4)) {
                System.out.println("Mã sản phẩm phải có 4 ký tự và bắt đầu bằng 'P'. Vui lòng nhập lại.");
            }
        } while (!(productid.startsWith("P") && productid.length() == 4));

        System.out.println("Nhập tên sản phẩm");
        do {
            productName = scanner.nextLine();
            if (productName.length() < 5 || productName.length() > 50) {
                System.out.println("Tên sản phẩm phải có từ 5-50 ký tự. Vui lòng nhập lại.");
            }
        } while (productName.length() < 5 || productName.length() > 50);

        System.out.println("Nhập giá trị nhập lớn hơn 0");
        do {
            importPrice = Float.parseFloat(scanner.nextLine());
            if (importPrice <= 0) {
                System.out.println("Giá nhập phải lớn hơn 0. Vui lòng nhập lại.");
            }
        } while (importPrice <= 0);

        System.out.println("Nhập giá trị xuất lớn hơn ít nhất 20% so với giá nhập");
        do {
            exportPrice = Float.parseFloat(scanner.nextLine());
            if (exportPrice < 1.2 * importPrice) {
                System.out.println("Giá xuất phải lớn hơn ít nhất 20% so với giá nhập. Vui lòng nhập lại.");
            }
        } while (exportPrice < 1.2 * importPrice);
        quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Mô tả sản phẩm");
        descriptions = scanner.nextLine();
        System.out.println("Trạng thái sản phẩm");
        status = Boolean.parseBoolean(scanner.nextLine());

    }
        public void displayData() {
            System.out.println("Product ID: " + this.productid);
            System.out.println("Product Name: " + this.productName);
            System.out.println("Import Price: " + this.importPrice);
            System.out.println("Export Price: " + this.exportPrice);
            System.out.println("Profit: " + this.profit);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Descriptions: " + this.descriptions);
            System.out.println("Status: " + (this.status ? "Đang bán" : "Không bán"));
        }

}

