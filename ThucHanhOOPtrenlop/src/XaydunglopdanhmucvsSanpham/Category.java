package XaydunglopdanhmucvsSanpham;

public class Category {
    private int categoryId;
    private String CategoryName;
    //Phương thức khởi tạo không tham số
    public Category(){

    }
    //Phương thức khởi tạo 2 tham số

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        CategoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", CategoryName='" + CategoryName + '\'' +
                '}';
    }

    public void dísplay(){
        System.out.println("Category{" +
                "categoryId=" + categoryId +
                ", CategoryName='" + CategoryName + '\'' +
                '}');
    }
}
