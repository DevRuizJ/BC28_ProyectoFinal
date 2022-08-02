package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.AFP;
import com.BC28.FinalProject.Service.IAFPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/afp")
public class AFPController {

    @Autowired
    private IAFPService service;

    @GetMapping
    public ResponseEntity<List<AFP>> AFPList(){
        List<AFP> response = service.findAll();
        return new ResponseEntity<List<AFP>>(response, HttpStatus.OK);
    }
}
