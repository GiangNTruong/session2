package Xaydunglophocsinh;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(1,"GIang",true,"JV1",20,"Hưng Yên");
        Student student2=new Student(2,"GIang1",true,"JV1",202,"Hưng Yên");
        Student student3=new Student(3,"GIang2",true,"JV1",201,"Hưng Yên");
        System.out.println("------------Thông tin của student1--------------");
        student1.display();
        System.out.println("------------Thông tin của student2--------------");
        student2.display();
        System.out.println("------------Thông tin của student3--------------");
        student3.display();
    }
}
