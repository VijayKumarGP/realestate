package com.vihan.realestate.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public class UserController {

    public String login(@RequestParam String userName,@RequestParam String password,Model model) {
        return "new_user";
    }

}
