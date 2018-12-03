package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dto.Employee;

@Controller
public class ObjectController {

    @RequestMapping("/readObject")
    public ModelAndView readObject() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displayObject");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Leo");
        employee.setSalary(6800);

        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
}
