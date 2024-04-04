package Baitap;

public class Baitap1 {
    /*
    isEmpty()           : dùng để  kiểm tra xem một chuỗi có rỗng hay không
trim()                 : dùng để loại bỏ khoảng trắng ở 2 đầu
equals() ,equalsIgnoreCase() : dùng để kiểm tra xem hai chuỗi có giống nhau hay không equals() phân biệt hoa thường , equalsIgnoreCase() không phân biệt hoa thường.
split()                 : dùng để tách một chuỗi thành một mảng các từ
concat()             : dùng để nối hai chuỗi lại với nhau
contains()          : dùng để kiểm tra chuỗi s1 chứa chuỗi s2 không
toUpperCase() : dùng để chuyển chữ thường trong chuỗi thành chữ hoa
toLowerCase() : dùng để chuyển chữ hoa trong chuỗi thành chữ thường
replace()      : dùng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới
length()            : dùng để lấy được độ dài của chuỗi

     */
    public static void main(String[] args) {
        String myString = "Hello, World!";
        //Kiểm tra chuỗi rỗng
        boolean isEmpty = myString.isEmpty();
        System.out.println("Is the string empty " +isEmpty);

        //Loại bỏ khoảng trắng 2 đầu chỗi
        String trimString = myString.trim();
        System.out.println("Trim string :    "+trimString );

        //Kiểm tra xem chuỗi có giống chuỗi khác hay không (phân biệt hoa thường)
        boolean isEqual = myString.equals("hello, world!");
        //Kiểm tra xem chuỗi có giống chuỗi khác hay ko (ko phân biệt hoa thường)
        boolean isEqualIgnoreCase = myString.equalsIgnoreCase("hello, world!");

        // Tách chuỗi thành mảng các từ
        String [] words = myString.split(" ");
        System.out.println("Words in the String:  ");
        for (String word : words){
            System.out.println(word);

            //Nói 2 chuỗi lại với nhau
            String concatString = myString.concat("welcom  ");
            System.out.println("concat string :     "+concatString);

            //Kiểm tra chuỗi có chư từ world ko
            boolean containWWorld = myString.contains("world");
            System.out.println("DÓe is world");
        }
    }
}
