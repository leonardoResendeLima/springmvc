package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {

    @RequestMapping("/showData")
    public ModelAndView showData(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("salary") String salary) {

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userRegister");
        return modelAndView;
    }
}
