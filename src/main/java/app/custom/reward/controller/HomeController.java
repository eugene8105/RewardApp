package app.custom.reward.controller;

import app.custom.reward.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @Autowired
    private UserListService userListService;

    // taking all data from UserListService and inserting into Model and passing to the form
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("pageTitle", "Reward Application");
        model.addAttribute("userList", userListService.getUser());

        return "index";
    }

    // Taking user input into LogOutput and inserting into the Model
    @GetMapping("/testinput")
    public String sendForm(Model model) {

        return "testinput";
    }

    // Passing the Model to the output form to display
    @PostMapping("/testinput")
    public String processForm(Model model) {

        return "output";
    }

}
