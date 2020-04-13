package com.gable.springweb;

import com.gable.springweb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {

    @Autowired
    public CustomerRepository repository;

    @GetMapping("/")
    public String getCustomers(Model model){

        model.addAttribute("customers", repository.getFullName());

        return "index";
    }
}
