package com.kumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RakeshKumar created on 12/01/24
 */
@RestController
public class BalanceController {
    @GetMapping("/myBalance")
    public  String getAccountDetails(){
        return "Here are Balance details from DB";
    }
}
