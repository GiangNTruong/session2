package Baitap;

import java.util.regex.Pattern;

public class Bai3 {
    public static void main(String[] args) {
        //Khai báo biểu thức
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        String emailtoCheck = "rikeiacademy@rikkeisoft.com";
        // Sử dụng Pattern.matches() để kiểm tra xem chuỗi có khớp với biểu thức chính quy hay không
        boolean isValidEmail = Pattern.matches(emailRegex, emailtoCheck);

        //Đưa ra kl
        if (isValidEmail){
            System.out.println("là 1 địa chỉ hợp lê");
        }else System.out.println("Ko hợp lệ");
    }
}
