package busmytrip.example.busmytrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {

    @GetMapping("/hotel")

    public String getData() {
        return "please book your Hotel The Grand Centralpoint hotel for 50% discount" ; }

}
