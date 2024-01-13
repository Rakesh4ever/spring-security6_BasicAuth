package com.kumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RakeshKumar created on 12/01/24
 */

@RestController
public class ContactController {
    @GetMapping("/myContact")
    public  String getContactDetails(){
        return "Here are Contact details from DB";
    }
}
