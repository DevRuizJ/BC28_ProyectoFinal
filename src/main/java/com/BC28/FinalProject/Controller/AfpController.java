package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.Afp;
import com.BC28.FinalProject.Model.Client;
import com.BC28.FinalProject.Repository.IAfpRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/afp")
public class AfpController {

    private static final Logger logger = LoggerFactory.getLogger(AfpController.class);

    @Autowired
    private IAfpRepository repo;

    @GetMapping("/list")
    public ResponseEntity<List<Afp>> AfpList() {
        List<Afp> response = new ArrayList<>();

        try{
            response = repo.findAll();
        }
        catch (Exception ex){

        }
        finally {
            logger.info("Fin de controller");
        }

        return new ResponseEntity<List<Afp>>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createAfp(@RequestBody Afp afp){
        String message = "No se pudo realizar la operación.";

        Afp response = new Afp();

        try{
            response = repo.save(afp);
            message = "Registro AFP correcto";
        }
        catch (Exception ex){
            message = "Error: " + ex.getMessage();
        }
        finally {
            logger.info("Fin de controller");
        }

        return new ResponseEntity<String>(message, HttpStatus.CREATED);
    }
}
