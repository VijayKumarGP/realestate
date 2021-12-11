package com.vihan.realestate.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    /**
     * To display home page.
     * @param model
     * @return
     */
    @GetMapping("/")
    public String viewHomePage(Model model) {
        // need to add model attributes for home page
        return "home";
    }
}
