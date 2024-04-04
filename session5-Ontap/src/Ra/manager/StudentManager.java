package Ra.manager;

import Ra.model.Student;

import java.util.Scanner;

public class StudentManager {
    private static Student[] students = new Student[100];
    private static int length=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Hiển thị danh sách tất cả học sinh\n" +

                    "2. Thêm mới học sinh\n" +

                    "3. Sửa thông tin học sinh dựa vào mã học sinh\n" +

                    "4. Xoá học sinh\n" +

                    "5. Sắp xếp sinh viên với id giảm dần \n"+

                    "6. Tìm kiếm sinh viên với tuổi nhập vào \n"+

                    "7. Thoát");
            System.out.println("Moi lua chon");
            int choice =  Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:showAllStudent();
                break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    editStudent();
                break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    sapXepGiamDan();
                    showAllStudent();
                    break;
                case 6:
                    timKiemAge();
                    break;
                case 7:
                    System.exit(0);
            }
        }while (true);
    }
    public static void showAllStudent(){
        for (int i = 0; i < length; i++) {
            students[i].display();

        }
    }
    public static void createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muốn nhập thêm mấy thằng");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            students[length]=new Student();
            students[length].inputData(scanner);
            length++;
        }
    }
    public static void editStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sửa");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            if (students[i].getStudentID()==n){
                students[i].inputData(scanner);
            }
        }
    }
    public static void deleteStudent(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập id xóa");
        int n=Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < length ; i++) {
            if (students[i].getStudentID()==n){
                index=i;
            }
        }
        if (index != -1){
            for (int i = index; i < length-1; i++) {
                students[i]=students[i+1];
            }
            length--;
            System.out.println("Đã xóa sinh viên có id " + n);
        }else {
            System.out.println("Không tìm thấy sinh viên có id" +n);
        }

    }
    public static void sapXepGiamDan() {
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (students[i].getStudentID() < students[j].getStudentID()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }

        }

    }
    public static void timKiemAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập danh sách sinh viên có tuổi : ");
        int n  =  Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            if (students[i].getAge()==n){
                students[i].display();
            }
        }
    }

}
