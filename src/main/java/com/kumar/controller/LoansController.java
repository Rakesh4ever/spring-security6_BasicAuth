package com.kumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RakeshKumar created on 12/01/24
 */
@RestController
public class LoansController {
    @GetMapping("/myLoans")
    public  String getLoansDetails(){
        return "Here are Loans details from DB";
    }
}
