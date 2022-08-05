package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.ClientAfp;
import com.BC28.FinalProject.Service.IClientAfpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cli-afp")
public class ClientAfpController {
    private static final Logger logger = LoggerFactory.getLogger(AfpController.class);

    @Autowired
    private IClientAfpService service;

    @PostMapping("/create")
    public ResponseEntity<String> createClientAfp(@RequestBody ClientAfp cliAfp){

        String message = "No se pudo realizar la operación.";

        ClientAfp response = new ClientAfp();

        try{
            response = service.register(cliAfp);
            message = "Registro Cliente AFP correcto";
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
