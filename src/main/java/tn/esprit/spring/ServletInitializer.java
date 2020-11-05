package tn.esprit.spring;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
 
public class ServletInitializer extends SpringBootServletInitializer {
 
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TimesheetApplication.class);
    }
    
   
   
    
}