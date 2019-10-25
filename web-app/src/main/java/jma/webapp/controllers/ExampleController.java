package jma.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * JMA - 25/10/2019 20:08
 **/
@RestController
public class ExampleController {

    @GetMapping("/")
    public Map<String, Object> getIndex(){
        Map<String,Object> returnVal = new HashMap<>();
        returnVal.put("Hello", "World");
        return returnVal;
    }
}
