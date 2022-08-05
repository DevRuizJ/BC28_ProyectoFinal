package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.Company;
import com.BC28.FinalProject.Repository.ICompanyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private static final Logger logger = LoggerFactory.getLogger(AfpController.class);

    @Autowired
    private ICompanyRepository repo;

    @GetMapping("/list")
    public ResponseEntity<List<Company>> CompanyList()
    {
        List<Company> response = new ArrayList<>();

        try {
            response = repo.findAll();
        }
        catch (Exception ex){

        }
        finally {
            logger.info("Fin de controller");
        }

        return new ResponseEntity<List<Company>>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createAfp(@RequestBody Company company){
        String message = "No se pudo realizar la operación.";

        Company response = new Company();

        try{
            response = repo.save(company);
            message = "Registro Empresa " +  company.getName() +" correcto";
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
