package pl.javastart.formvalidation1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValidationController {

    @GetMapping("/")
    public String formPage() {

        return "form-page";
    }
}
