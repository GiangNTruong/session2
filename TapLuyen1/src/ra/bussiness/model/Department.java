package ra.bussiness.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Department {
    private String departmentId,departmentName ;
    private int totalMembers; // giá trị mặc định = 0

    public Department() {
    }

    public Department(String departmentId, String departmentName, int totalMembers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }
    public void inputData(boolean idAdd , List<Department> departmentList ){
        if (idAdd){
            this.departmentId = getInputDepartmentId(departmentList);
        }
        this.departmentName = getInputDepartment(departmentList);

    }
    public String getInputDepartmentId(List<Department> departmentList){
        final String regex = "^D\\w{3}$";
        Scanner sc = new Scanner(System.in);
        while ( true){
            System.out.println("Nhập vào mã phòng ban");
            String departmentIdInput =sc.nextLine();
            if(departmentIdInput.matches(regex)){
                //dung dinh dang -> kiem tra trung nhac
                if (departmentList.stream().noneMatch(t->t.getDepartmentId().equals(departmentIdInput))){
                    return departmentIdInput;
                }
                System.err.println("Id da trung lap moi nhap lai");

            }else {
                System.err.println("Khong dung dinh dang (D___)");
            }
        }
    }
    public String getInputDepartment (List<Department> departmentList){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhap vao ten phong ban : ");
            String departmentNameInput = sc.nextLine();
            if(!departmentNameInput.isBlank()){
                //dung dinh dang -> kiem tra trung lap
                if (departmentList.stream().noneMatch(t->t.departmentName.equals(departmentNameInput))){
                    return departmentNameInput;
                }
                System.err.println("Ten trung lap , Nhap lai");
            }else {
                System.err.println("Khong dc de trong");
            }
        }
    }

    public void displayData(){
        System.out.println("Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", totalMembers=" + totalMembers +
                '}');
        System.out.println("---------------------------------");
    }
}
