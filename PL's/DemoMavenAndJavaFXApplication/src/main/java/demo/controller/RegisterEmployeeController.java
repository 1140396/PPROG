package demo.controller;

import demo.model.Category;
import demo.model.Company;
import demo.model.Employee;
import java.util.Set;

public class RegisterEmployeeController {

    private final ApplicationEM applicationEM;
    private final Company company;
    private Employee employee;
    
    public RegisterEmployeeController() {
        this.applicationEM = ApplicationEM.getInstance();
        this.company = applicationEM.getCompany();
        this.employee = null;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public Employee newEmployee(int number, String name, Category category){
        this.employee = company.getRegisterEmployees().newEmployee(number, name, category);
        return this.employee;
    }
    
    public boolean registerEmployee(){
        if(company.getRegisterEmployees().validEmployee(this.employee))
            return company.getRegisterEmployees().addEmployee(this.employee);
        return false;
    }

    public Set<Category> getCategories(){
        return company.getRegisterCategories().getCategories();
    }
    
}
