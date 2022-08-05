package com.BC28.FinalProject.Controller;

import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;
import com.BC28.FinalProject.Service.IMoneyWithdrawalRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/withdrawal")
public class MoneyWithdrawalRequestController {

    private static final Logger logger = LoggerFactory.getLogger(AfpController.class);

    @Autowired
    private IMoneyWithdrawalRequestService service;

    @GetMapping("/{idWithdrawal}")
    public ResponseEntity<MoneyWithdrawalRequest> getClientById(@PathVariable("idWithdrawal") Integer idWithdrawal){

        MoneyWithdrawalRequest response = new MoneyWithdrawalRequest();

        try{
            response = service.listById(idWithdrawal);
        }
        catch (Exception ex){

        }
        finally {
            logger.info("Fin de controller");
        }
        return new ResponseEntity<MoneyWithdrawalRequest>(response, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createWithdrawal(@RequestBody MoneyWithdrawalRequest withdrawal){

        String message = "No se pudo realizar la operación.";

        MoneyWithdrawalRequest response = new MoneyWithdrawalRequest();

        try{
            response = service.register(withdrawal);
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
