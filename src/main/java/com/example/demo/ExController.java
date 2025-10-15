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
    public boolean getEx327() {
    	return exService.ex327();
    }
    
//  http://localhost:8080/ex328
    @GetMapping("/ex328")
    public boolean getEx328() {
    	return exService.ex328();
    }
    
//  http://localhost:8080/ex331
    @GetMapping("/ex331")
    public boolean getEx331() {
    	return exService.ex331();
    }
    
//  http://localhost:8080/ex332
    @GetMapping("/ex332")
    public boolean getEx332() {
    	return exService.ex332();
    }
    
//  http://localhost:8080/ex328
    @GetMapping("/ex333")
    public boolean getEx333() {
    	return exService.ex333();
    }
    
//  http://localhost:8080/ex328
    @GetMapping("/ex334")
    public boolean getEx334() {
    	return exService.ex334();
    }

}
