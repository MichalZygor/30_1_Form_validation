package pl.javastart.formvalidation1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ValidationController {

    @GetMapping("/")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "form-page";
    }

    @PostMapping("/add-user")
    public String addUser(Model model, @Valid @ModelAttribute User user, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            model.addAttribute("user", user);
            return "form-page";
        }
        return "redirect:/sukces";
    }

    @GetMapping("/sukces")
    public String successPage() {
        return "succes";
    }
}
