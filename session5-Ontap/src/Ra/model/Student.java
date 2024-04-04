package Ra.model;

import java.util.Scanner;

public class Student {
    private int studentID;

    private String studentName;
    private boolean sex;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int studentID, String studentName, boolean sex, int age, String address) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhap id sinh vien");
        studentID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap name sinh vien");
        studentName=scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        sex = Boolean.getBoolean(scanner.nextLine());
        System.out.println("Nhap tuoi");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dia chi");
        address = scanner.nextLine();
    }



    public void display(){

        System.out.println("Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", sex=" + (sex?"Nam":"Nữ") +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}');
        System.out.println("========");
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
