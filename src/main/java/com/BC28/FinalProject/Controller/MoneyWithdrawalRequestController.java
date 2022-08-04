package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;
import com.BC28.FinalProject.Repository.IMoneyWithdrawalRequestRepository;
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
@RequestMapping("/withdrawal")
public class MoneyWithdrawalRequestController {

    private static final Logger logger = LoggerFactory.getLogger(AfpController.class);

    @Autowired
    private IMoneyWithdrawalRequestRepository repo;

    @PostMapping("/create")
    public ResponseEntity<String> createWithdrawal(@RequestBody MoneyWithdrawalRequest withdrawal){
        String message = "No se pudo realizar la operación.";
        MoneyWithdrawalRequest response = new MoneyWithdrawalRequest();
        try{
            response = repo.save(withdrawal);
            message = "Registro " + withdrawal.getIdWithdrawal() + " correcto";
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
