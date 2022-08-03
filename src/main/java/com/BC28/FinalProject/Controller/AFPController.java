package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.AFP;
import com.BC28.FinalProject.Service.IAFPService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/afp")
public class AFPController {

    private static final Logger logger = LoggerFactory.getLogger(AFPController.class);

    @Autowired
    private IAFPService service;

    @GetMapping("/list")
    public ResponseEntity<List<AFP>> AFPList() {
        List<AFP> response = new ArrayList<>();

        try{
            response = service.findAll();
        }
        catch (Exception ex){

        }
        finally {
            logger.info("Fin de controller");
        }

        return new ResponseEntity<List<AFP>>(response, HttpStatus.OK);
    }
}
