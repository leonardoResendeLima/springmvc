package controller;

import dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("userRegistration")
    public ModelAndView showRegistrationPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userRegister");
        return modelAndView;
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public ModelAndView registerUser(@ModelAttribute("user") User user ){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user" , user);
        modelAndView.setViewName("registrationInfo");
        return modelAndView;
    }

}
