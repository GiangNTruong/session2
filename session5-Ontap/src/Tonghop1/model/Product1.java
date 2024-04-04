package Tonghop1.model;

import java.util.Scanner;

public class Product1 {
    private String productid;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public Product1() {
    }

    public Product1(String productid, String productName, float importPrice, float exportPrice, int quantity, String descriptions, boolean status) {
        this.productid = productid;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
        this.profit = calProfit();
    }

    public void inputData(Scanner scanner, Product1[] arrProduct) {
        System.out.println("Nhập mã sản phẩm (4 ký tự, bắt đầu bằng 'P'): ");
        boolean firstInput = true;
        while (true) {
            this.productid = scanner.nextLine().trim();
            if (this.productid.length() == 4 && this.productid.startsWith("P")) {
                boolean isDuplicate = false;
                for (Product1 product : arrProduct) {
                    if (product != null && product.productid.equals(this.productid)) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    break;
                } else {
                    System.out.println("Mã sản phẩm đã bị trùng, vui lòng nhập lại: ");
                }
            } else {
                if (!firstInput) {
                    System.out.println("Mã sản phẩm không hợp lệ, vui lòng nhập lại: ");
                }
                firstInput = false;
            }
        }

        System.out.println("Nhập tên sản phẩm (5-50 ký tự): ");
        while (true) {
            this.productName = scanner.nextLine().trim();
            if (this.productName.length() >= 5 && this.productName.length() <= 50) {
                break;
            } else {
                System.out.println("Tên sản phẩm không hợp lệ, vui lòng nhập lại: ");
            }
        }

        System.out.println("Nhập giá nhập (lớn hơn 0): ");
        while (true) {
            this.importPrice = scanner.nextFloat();
            if (this.importPrice > 0) {
                break;
            } else {
                System.out.println("Giá nhập không hợp lệ, vui lòng nhập lại: ");
            }
        }

        System.out.println("Nhập giá xuất (ít nhất lớn hơn 20% so với giá nhập): ");
        while (true) {
            this.exportPrice = scanner.nextFloat();
            if (this.exportPrice > this.importPrice * 1.2) {
                break;
            } else {
                System.out.println("Giá xuất không hợp lệ, vui lòng nhập lại: ");
            }
        }

        System.out.println("Nhập số lượng sản phẩm (lớn hơn 0): ");
        while (true) {
            this.quantity = scanner.nextInt();
            if (this.quantity > 0) {
                break;
            } else {
                System.out.println("Số lượng sản phẩm không hợp lệ, vui lòng nhập lại: ");
            }
        }

        scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();

        System.out.println("Nhập trạng thái sản phẩm (true cho đang bán, false cho không bán): ");
        this.status = scanner.nextBoolean();
    }

    public void displayData() {
        String statusStr = status ? "Đang bán" : "Không bán";
        System.out.println("Product ID: " + productid + ", Product Name: " + productName + ", Import Price: " + importPrice + ", Export Price: " + exportPrice + ", Profit: " + profit + ", Quantity: " + quantity + ", Descriptions: " + descriptions + ", Status: " + statusStr);
    }

    public float calProfit() {
        return exportPrice - importPrice;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
