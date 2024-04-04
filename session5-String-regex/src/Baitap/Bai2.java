package Baitap;

public class Bai2 {
    public static void main(String[] args) {
        //Khai báo 1 chuỗi
        StringBuffer stringBuffer = new StringBuffer("Hello , HIhi ");

        //Nối thêm chuỗi vào chuỗi

        stringBuffer.append("Welcome");

        //Chèn chuỗi vào vị trí cụ thể
        stringBuffer.insert(7, "Awesome ");

        //Thay thế 1 phần của chuỗi
        stringBuffer.replace(0,5,"Hi");

        //Xóa
        stringBuffer.delete(2,4);

        //Lấy độ daài của chuỗi đã chỉnh sửa
        int stringLength = stringBuffer.length();

        //Dảo ngược
        stringBuffer.reverse();

        System.out.println("Chuỗi sau khi sử dụng các phương thức của StringBuffer: " +stringBuffer);
        System.out.println("ĐỘ dài của chuô khi chinnh sửa :" +stringLength);

    }
}
