package stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DataStructure {


    private ExtraHours extraHours; //if we want to inject one to another both need to be @COMPONENTS


    public void getTotalHours(){
        System.out.println("Total hours: "+ ( 45 + extraHours.getHour() ));
    }



}
