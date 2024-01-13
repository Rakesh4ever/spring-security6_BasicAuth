package com.kumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RakeshKumar created on 12/01/24
 */

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public  String getCardsDetails(){
        return "Here are Cards details from DB";
    }
}
