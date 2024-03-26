package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "fulltime")
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean(name = "partime")
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
