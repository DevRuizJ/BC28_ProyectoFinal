package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.Client;
import com.BC28.FinalProject.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService service;

    @GetMapping
    public ResponseEntity<List<Client>> ClientList(){
        List<Client> response =service.findAll();
        return new ResponseEntity<List<Client>>(response, HttpStatus.OK);
    }


}
