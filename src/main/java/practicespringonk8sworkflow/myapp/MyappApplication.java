package practicespringonk8sworkflow.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
    }

}

@RestController
class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, I am happy!!";
    }
}
