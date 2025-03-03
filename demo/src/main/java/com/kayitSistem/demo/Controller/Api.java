package com.kayitSistem.demo.Controller;


import com.kayitSistem.demo.ModelLayer.Register;
import com.kayitSistem.demo.ServiceLayer.ServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    private ServiceInterface serviceInter;

    public Api(ServiceInterface serviceInter) {
        this.serviceInter = serviceInter;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/api/public/addUsers")
    public ResponseEntity<String> Register(@RequestBody Register register){
        serviceInter.Register(register);
        return new ResponseEntity<>("User added", HttpStatus.CREATED);
    }
}

