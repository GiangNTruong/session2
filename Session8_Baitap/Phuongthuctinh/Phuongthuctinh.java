package Session8_Baitap.Phuongthuctinh;

public class Phuongthuctinh {
    public static void main(String[] args) {
        System.out.println("Diện tích hình tròn có bán kính 3.5: " + StaticMethod.calCircleArea(3.5));
        System.out.println("Diện tích hình tròn có bán kính 6: " + StaticMethod.calCircleArea(6));
        System.out.println("Diện tích hình tam giác có các cạnh là (3, 4, 5): " + StaticMethod.calTriangleArea(3, 4, 5));
        System.out.println("Diện tích hình tam giác có các cạnh là (4.5, 7, 6): " + StaticMethod.calTriangleArea(4.5, 7, 6));
        System.out.println("Diện tích hình chữ nhật có kích thước (2.5, 6): " + StaticMethod.calRectangleArea(2.5, 6));
        System.out.println("Diện tích hình chữ nhật có kích thước (4, 7): " + StaticMethod.calRectangleArea(4, 7));
    }
}
