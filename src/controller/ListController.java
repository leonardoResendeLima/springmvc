package controller;

import dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ListController {

    @RequestMapping("/readList")
    public ModelAndView readList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("displayList");

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Leo");
        employee.setSalary(6800);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setName("Isabelle");
        employee2.setSalary(2000);

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setName("Juliana");
        employee3.setSalary(0);

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);

        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}
