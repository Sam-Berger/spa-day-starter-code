//package org.launchcode.spaday.controllers;
//
//
//import org.launchcode.spaday.models.User;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("user")
//public class UserController {
//
//    @GetMapping("add")
//    public String displayAddUserForm() {
//        return "user/add";
//    }
//
//    @PostMapping("add")
//    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        model.addAttribute("username",user.getUsername());
//        model.addAttribute("email",user.getEmail());
//        model.addAttribute("email",user.getEmail());
//        if (verify.equals(user.getPassword())) {
//            return "user/index";
//        }
//        else {
//            model.addAttribute("error","Your passwords do not match! Please try again!");
//            return "user/add";
//        }
//
//    }
//
//}

package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        if(verify.equals(user.getPassword())) {
            return "user/index";
        } else {
            model.addAttribute("error", "The passwords you entered do not match. Please enter passwords again.");
            return "user/add";
        }
    }

}