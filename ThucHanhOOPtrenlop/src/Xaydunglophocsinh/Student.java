package Xaydunglophocsinh;

public class Student {
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;
    //Phương thức khởi tạo 0 tham số
    public Student(){

    }
//Phương thức khởi tạo 6 tham số
    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", sex=" + sex +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public void display() {
        System.out.println("studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", sex=" + sex +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", address='" + address +"\n");

    }
}
