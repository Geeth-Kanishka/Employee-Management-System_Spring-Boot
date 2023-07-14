package com.example.CRUDemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.CRUDemployee.domain.employee;
import com.example.CRUDemployee.service.employeeService;

@Controller

public class employeeController {
	
	@Autowired
    private employeeService service;

	
 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<employee> listemployee = service.listAll();
        model.addAttribute("listemployee", listemployee);
        System.out.print("Get / ");
        return "index";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("employee", new employee());
        return "new";
    }
    
 
    @PostMapping("/")
    public employee addemployee(@RequestBody employee employee) {
    	service.save(employee);
    	return employee;
    }
    
    
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveemployee(@ModelAttribute("employee") employee emp) {
        service.save(emp);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditemployeePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        employee emp = service.get(id);
        mav.addObject("employee", emp);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deleteemployee(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
	
	

}
