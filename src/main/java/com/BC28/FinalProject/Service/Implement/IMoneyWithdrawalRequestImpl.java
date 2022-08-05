package com.BC28.FinalProject.Service.Implement;

import com.BC28.FinalProject.Model.Afp;
import com.BC28.FinalProject.Model.Client;
import com.BC28.FinalProject.Model.ClientAfp;
import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;
import com.BC28.FinalProject.Repository.IMoneyWithdrawalRequestRepository;
import com.BC28.FinalProject.Service.IAfpService;
import com.BC28.FinalProject.Service.IClientService;
import com.BC28.FinalProject.Service.IMoneyWithdrawalRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IMoneyWithdrawalRequestImpl implements IMoneyWithdrawalRequestService {

    @Autowired
    private IMoneyWithdrawalRequestRepository withdrawalRepo;

    @Autowired
    private IClientService cliServ;

    @Autowired
    private IAfpService afpServ;

    @Override
    public MoneyWithdrawalRequest register(MoneyWithdrawalRequest obj) {
        return withdrawalRepo.save(obj);
    }

    @Override
    public MoneyWithdrawalRequest modify(MoneyWithdrawalRequest obj) {
        return withdrawalRepo.save(obj);
    }

    @Override
    public List<MoneyWithdrawalRequest> list() {
        return withdrawalRepo.findAll();
    }

    @Override
    public MoneyWithdrawalRequest listById(Integer id) {
        Optional<MoneyWithdrawalRequest> op = withdrawalRepo.findById(id);
        return op.isPresent() ? op.get() : new MoneyWithdrawalRequest();
    }

    @Override
    public boolean delete(Integer id) {
        withdrawalRepo.deleteById(id);
        return true;
    }

    @Override
    public String validateWithdrawal(MoneyWithdrawalRequest withdrawal) {

        String message = "No se pudo realizar la Operación";

        Client cli = cliServ.listById(withdrawal.getIdClient());

        Afp afp = afpServ.listById(withdrawal.getIdAfp());

        ClientAfp cliAfp = new ClientAfp();


        try{

        }
        catch (Exception ex){

        }

         return message;
    }
}
