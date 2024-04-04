package Session8_Baitap.Baitap1;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Hello, World!");

        System.out.println("Giá trị ban đầu của thuộc tính myString: " + myObject.getMyString());

        myObject.setMyString("Xin chào, thế giới!");
        System.out.println("Giá trị mới của thuộc tính myString: " + myObject.getMyString());
    }
}