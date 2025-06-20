package com.techzen.academy_n0325c1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/Hello") // dường dẫn , endpoint
    public String greeting(@RequestParam(defaultValue = "")  String name,
                            @RequestParam(defaultValue = "Đà Nẵng") String address){
        return "Hello "+ name +"," + address;
    }
}
