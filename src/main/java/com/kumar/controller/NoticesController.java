package com.kumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RakeshKumar created on 12/01/24
 */
@RestController
public class NoticesController {
    @GetMapping("/notices")
    public  String getNoticesDetails(){
        return "Here are Notices details from DB";
    }
}
