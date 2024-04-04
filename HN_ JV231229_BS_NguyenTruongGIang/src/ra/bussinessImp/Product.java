package ra.bussinessImp;

import ra.bussiness.IProduct;

import java.util.Scanner;

public class Product implements IProduct ,Comparable<Product>  {
    private int productid ;
    private String productName;
    private String title;
    private String descriptions;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private Boolean productStatus;

    public Product() {
    }

    public Product(int productid, String productName, String title, String descriptions, float importPrice, float exportPrice, float interest, Boolean productStatus) {
        this.productid = productid;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest =interest;
        this.productStatus = productStatus;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
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

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã sản phẩm:");
        this.productid = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên sản phẩm:");
        this.productName = scanner.nextLine();

        System.out.println("Nhập tiêu đề sản phẩm:");
        this.title = scanner.nextLine();

        System.out.println("Nhập mô tả sản phẩm:");
        this.descriptions = scanner.nextLine();


        System.out.println("Nhập giá nhập:");
        this.importPrice = Float.parseFloat(scanner.nextLine());


        System.out.println("Nhập giá xuất:");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        this.interest = this.exportPrice-this.importPrice;

        System.out.println("Nhập trạng thái sản phẩm (true = hoạt động, false = không hoạt động):");
        this.productStatus = Boolean.parseBoolean(scanner.nextLine());
    }



    @Override
    public void displayData() {
        System.out.println("Product{" +
                "productid=" + productid +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", productStatus=" + (productStatus?"Hoạt dong":"Khong hoat dong") +
                '}');
    }

    @Override
    public int compareTo(Product o) {
        return Float.compare(this.interest, o.interest);
    }

}
