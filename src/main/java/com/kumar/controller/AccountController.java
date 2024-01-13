package com.kumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RakeshKumar created on 12/01/24
 */
@RestController
public class AccountController {
    @GetMapping("/myAccount")
    public  String getAccountDetails(){
        return "Here are Account details from DB";
    }
}
