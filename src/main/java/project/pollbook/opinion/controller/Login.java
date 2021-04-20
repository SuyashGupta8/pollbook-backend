package project.pollbook.opinion.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/login")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Login {

    @GetMapping(path="/test", produces = "application/json")
    public Map getEmployees()
    {
        Map testMap = new HashMap();
        testMap.put("name", "suyash");
        return testMap;
    }
}
