package ra.bussiness.design;

import ra.bussiness.model.Employee;

public interface IEmployeeDesign extends IGenericDesign<Employee,String>{
void displayDetail();
void getListEmployeeByDepartment();
void getAvgEmployeePerDepartment();
void fin5DepartmentCrowded();
void finMostmanager();
void find5OldestEmployee();
void find5HighestSlart();
}
