package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {

   @Bean
    public String str1(){
        return "Welcome to Cydeo";

    }

    @Bean
    public String str2(){
        return "Spring core practice";
    }
}
