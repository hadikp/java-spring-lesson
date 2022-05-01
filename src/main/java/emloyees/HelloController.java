package emloyees;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    @GetMapping("/") //get kéréseket szolgálja ki
    @ResponseBody //azonnal be kell írni a Http válasz törzsébe
    public String sayHello() {
        return "Hello Spring!" + LocalDateTime.now();
    }
}
