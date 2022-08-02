package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.Company;
import com.BC28.FinalProject.Service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private ICompanyService service;

    @GetMapping
    public ResponseEntity<List<Company>> CompanyList()
    {
        List<Company> response = service.findAll();
        return new ResponseEntity<List<Company>>(response, HttpStatus.OK);
    }
}
