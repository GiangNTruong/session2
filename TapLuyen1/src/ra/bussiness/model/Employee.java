package ra.bussiness.model;

import ra.bussiness.config.InputMethods;
import ra.bussiness.config.ShopConfig;

import java.awt.im.InputContext;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private String employeeId,employeeName;
    private LocalDate birthday;
    private boolean sex;
    private double salary;
    private Employee manager;
    private Department department;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, LocalDate birthday, boolean sex, double salary, Employee manager, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void inputData(boolean isAdd , List<Employee> employeeList , List<Department> departmentList){
        if (isAdd){
            this.employeeId = getInputEmployeeId(employeeList);
        }
        this.employeeName = getInputEmployeeName();

    }
    public String getInputEmployeeId (List<Employee> employeeList){
        final String regex = "^E\\w{4}$";
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào mã nhân viên");
            String employeeIdInput = sc.nextLine();
            if (employeeIdInput.matches(regex)){
                // đúng định dạng -> kiểm tra trùng lặp
                if (employeeList.stream().noneMatch(t->t.getEmployeeId().equals(employeeIdInput))){
                    // trùng lặp
                    return employeeIdInput;
                }
                System.err.println("Id đã tồn tại, vui long nhập giá trị khác");
            }else {
                System.err.println("Không đúng định dạng (E____)");
            }
        }
    }
    public String getInputEmployeeName (){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhap vao ten nhan vien");
            String employeeNameInput = scanner.nextLine();
            if(employeeNameInput.isBlank()){
                System.err.println("ko dc de trong");
            }else {
                return employeeNameInput;
            }
        }
    }
    private LocalDate getInputBirthdDay(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhap vao ngay sinh dd/MM/yyyy : ");
            String employeeDateInput = sc.nextLine();
            try{
                return LocalDate.parse(employeeDateInput, ShopConfig.DTF);
            }catch (DateTimeParseException e){
                System.err.println("KO dung dinh dang");
            }
        }
    }
    private Department getInputDepartment ( List<Department> departmentList){
        Scanner sc = new Scanner(System.in);
        // hien thi danh sach phong ban
        System.out.println("Danh sach phong ban ");
        for (int i = 0; i < departmentList.size(); i++) {
            System.out.printf("STT : %d | Name : %-15s |\n",i+1,departmentList.get(i).getDepartmentName());
        }
        while (true){
            System.out.println("Nhap vao vi tri phong ban (Theo STT)");
            int index = sc.nextInt();
            if (index>=1 && index<=departmentList.size()){
                Department department1 = departmentList.get(index-1);
                //Tang so nv len 1
                department1.setTotalMembers(department1.getTotalMembers()+1);
                return department1;
            }
            System.err.println("Vi tri nhap ko hopw le , nhap lai");
        }
    }


    public void displayData(){
        System.out.printf("| ID : %-5s | Name : -15s |\n",employeeId,employeeName);
        System.out.println("------------------------------");
    }

   public void displayDetailData(){
       System.out.println("Employee{" +
               "employeeId='" + employeeId + '\'' +
               ", employeeName='" + employeeName + '\'' +
               ", birthday=" + birthday +
               ", sex=" + sex +
               ", salary=" + salary +
               ", manager=" + manager +
               ", department=" + department +
               '}');
       System.out.println("-------------------------------------------");
   }
}
