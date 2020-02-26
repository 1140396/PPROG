package demo.controller;

import demo.model.Company;
import demo.model.Constantes;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationEM {
    
    private final Company company;
    
    private ApplicationEM()
    {
        Properties props = getProperties();
        this.company = new Company(props.getProperty(Constantes.PARAMS_COMPANY_NAME));
    }

    public Company getCompany() {
        return this.company;
    }
    
    private Properties getProperties()
    {
        Properties props = new Properties();
        
        // Add properties and default values
        props.setProperty(Constantes.PARAMS_COMPANY_NAME, "LAPR2");
        
        // Read properties and defined values  
        try {
            InputStream in = new FileInputStream(Constantes.PARAMS_FILE);
            props.load(in);
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(ApplicationEM.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return props;
    }

    private static ApplicationEM singleton = null;
    public static ApplicationEM getInstance() 
    {
        if(singleton == null) 
        {
            synchronized(ApplicationEM.class) 
            { 
                singleton = new ApplicationEM();
            }
        }
        return singleton;
    }
}
