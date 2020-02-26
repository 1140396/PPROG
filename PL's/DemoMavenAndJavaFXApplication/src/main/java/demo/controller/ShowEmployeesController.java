package demo.controller;

import demo.model.Company;

public class ShowEmployeesController {

    private final ApplicationEM applicationEM;
    private final Company company;

    public ShowEmployeesController() {
        this.applicationEM = ApplicationEM.getInstance();
        this.company = applicationEM.getCompany();
    }

    public Company getCompany() {
        return company;
    }
    
}
