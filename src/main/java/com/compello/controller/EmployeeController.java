package com.compello.controller;

import com.compello.model.CompelloDate;
import com.compello.model.Employee;
import com.compello.repository.CompelloDateRepository;
import com.compello.repository.CustomRepository;
import com.compello.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private CompelloDateRepository compelloDateRepository;

    @Autowired
    private CustomRepository customRepository;

    @RequestMapping("/employee/save-form")
    public String saveEmployeeForm(Model model){
        model.addAttribute("employee", new Employee());
        return "employee-form";
    }

    @RequestMapping("/employee/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee, Model model){
        employeeRepository.save(employee);
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee-list";
    }

    @RequestMapping("/employee/list")
    public String getEmployeeList(Model model){
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee-list";
    }


    @RequestMapping("/employee/details")
    public String getEmployeeDetails(@RequestParam("id") Long employeeId, Model model) {
        List<CompelloDate> daysByEmployee = customRepository.getDaysByEmployee(employeeId);
        Employee employee = employeeRepository.findOne(employeeId);
        model.addAttribute("holidays", daysByEmployee);
        model.addAttribute("employee", employee);

        return "employee-detail";
    }




}
