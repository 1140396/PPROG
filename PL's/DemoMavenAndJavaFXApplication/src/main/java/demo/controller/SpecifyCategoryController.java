package demo.controller;

import demo.model.Category;
import demo.model.Company;

public class SpecifyCategoryController {
    
    private final ApplicationEM applicationEM;
    private final Company company;
    private Category category;

    public SpecifyCategoryController() {
        this.applicationEM = ApplicationEM.getInstance();
        this.company = applicationEM.getCompany();
        this.category = null;
    }
    
    public Category getCategory() {
        return this.category;
    }
    

    public boolean newCategory(String id, String description){
        this.category=this.company.getRegisterCategories().newCategory(id, description);
        return true;
    }
    
    public boolean registerCategory(){
        if(this.company.getRegisterCategories().validCategory(this.category))
            return this.company.getRegisterCategories().addCategory(this.category);
        return false;
    }
    
}
