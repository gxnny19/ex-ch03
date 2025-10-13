package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 컨트롤러 선언
public class ExController {

    @Autowired
    private ExService exService;

//    http://localhost:8080/ex321
    @GetMapping("/ex321")
    public String getEx321() {
        return exService.ex321();
    }

//  http://localhost:8080/ex322
    @GetMapping("/ex322")
    public String getEx322() {
        return exService.ex322();
    }
    
//  http://localhost:8080/ex323
    @GetMapping("/ex323")
    public String getEx323() {
    	return exService.ex323();
    }
    
//  http://localhost:8080/ex324
    @GetMapping("/ex324")
    public String getEx324() {
    	return exService.ex324();
    }
    
//  http://localhost:8080/ex325
    @GetMapping("/ex325")
    public String getEx325() {
    	return exService.ex325();
    }
    
//  http://localhost:8080/ex326
    @GetMapping("/ex326")
    public String getEx326() {
    	return exService.ex326();
    }
    	
//  http://localhost:8080/ex327
    @GetMapping("/ex327")
    public String getEx327() {
    	return exService.ex327();
    }
}
