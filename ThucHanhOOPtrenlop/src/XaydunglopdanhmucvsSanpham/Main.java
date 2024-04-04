package XaydunglopdanhmucvsSanpham;

public class Main {
    public static void main(String[] args) {
        Category dm1 = new Category(1,"quần");
        Category dm2 = new Category(2,"áo");
        Product product1 = new Product(1,"quần âu",1500505,dm1);
        Product product2 = new Product(1,"áo âu",1500505,dm2);
        Product product3 = new Product(1,"quần âu",1500505,dm1);
        product1.display();
        product2.display();
        product3.display();
    }

}
