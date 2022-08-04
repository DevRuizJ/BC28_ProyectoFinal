package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.Client;
import com.BC28.FinalProject.Repository.IClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private static final Logger logger = LoggerFactory.getLogger(AfpController.class);

    @Autowired
    private IClientRepository repo;

    @GetMapping("/list")
    public ResponseEntity<List<Client>> clientList(){

        List<Client> response = new ArrayList<>();

        try {
            response = repo.findAll();
        }
        catch (Exception ex)
        {
            response = null;
        }
        finally {
            logger.info("Fin de controller");
        }

        return new ResponseEntity<List<Client>>(response, HttpStatus.OK);
    }

    @GetMapping("/{idClient}")
    public ResponseEntity<Client> getClientById(@PathVariable("idClient") Integer idClient){

        Client response = new Client();

        try{
            response = repo.findById(idClient).get();
        }
        catch (Exception ex){

        }
        finally {
            logger.info("Fin de controller");
        }
        return new ResponseEntity<Client>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createClient(@RequestBody Client client){
        String message = "No se pudo realizar la operación.";

        Client response = new Client();

        try{
            response = repo.save(client);
            message = "Registro " + client.getDocNumber()  + " correcto";
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
