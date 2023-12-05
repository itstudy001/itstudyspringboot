package shinanjaeun.com.itstudyspringboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("/")
    public String home(){
        return "Hello SpringBoot3";
    }

}