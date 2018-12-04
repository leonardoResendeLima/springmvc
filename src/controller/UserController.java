package controller;

import dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping("userRegistration")
    public String showRegistrationPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("userRegister");
//        return modelAndView;
        return "userRegister";

    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
//        System.out.println(user);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("user", user);
//        modelAndView.setViewName("registrationInfo");
//        return modelAndView;
        model.addAttribute("user", user);
        return "registrationInfo";
    }

}
