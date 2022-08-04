package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.DocumentType;
import com.BC28.FinalProject.Repository.IDocumentTypeRepository;
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
@RequestMapping("/document-type")
public class DocumentTypeController {

    private static final Logger logger = LoggerFactory.getLogger(AfpController.class);

    @Autowired
    private IDocumentTypeRepository repo;

    @PostMapping("/create")
    public ResponseEntity<String> createDocType(@RequestBody DocumentType docType){

        String message = "No se pudo realizar la operación.";
        DocumentType response = new DocumentType();

        try{
            response = repo.save(docType);
            message = "Tipo documento " + docType.getName() + " creado correctamente";
        }
        catch (Exception ex){}
        finally {
            logger.info("Fin de controller");
        }

        return new ResponseEntity<String>(message, HttpStatus.CREATED);
    }
}
