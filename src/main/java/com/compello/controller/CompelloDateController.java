package com.compello.controller;

import com.compello.model.CompelloDate;
import com.compello.model.Employee;
import com.compello.repository.CompelloDateRepository;
import com.compello.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class CompelloDateController {

    @Autowired
    private CompelloDateRepository compelloDateRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/compello-date/save-form")
    public String save(@RequestParam("employeeId") Long employeeId, Model model) {
        CompelloDate holiday = new CompelloDate();
        holiday.setEmployee(employeeRepository.findOne(employeeId));
        model.addAttribute("compelloDate", holiday);
        model.addAttribute("empId", employeeId);
        return "holiday-form";
    }

    @RequestMapping("/compello-date/save")
    public String save(@ModelAttribute("compelloDate") CompelloDate compelloDate, @RequestParam("employeeId") Long employeeId,Model model) {
        Employee employee = employeeRepository.findOne(employeeId);
        compelloDate.setEmployee(employee);
        compelloDate.setDate(Calendar.getInstance().getTime());
        compelloDateRepository.save(compelloDate);
        model.addAttribute("employeeId",employeeId );
        return "holiday-list";
    }

    @RequestMapping("/compello-date/list")
    public String save(Model model) {
        Iterable<CompelloDate> all = compelloDateRepository.findAll();
        model.addAttribute("holidays", all);
        return "holiday-list";
    }

    @RequestMapping("/compello-date/approve")
    public String approve(@RequestParam("id") Long id, Model model) {
        CompelloDate compelloDate = compelloDateRepository.findOne(id);
        compelloDate.setApproved(true);
        compelloDateRepository.save(compelloDate);

        model.addAttribute("holidays", compelloDateRepository.findAll());
        return "holiday-list";
    }

}
