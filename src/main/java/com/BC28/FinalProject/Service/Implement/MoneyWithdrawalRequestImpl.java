package com.BC28.FinalProject.Service.Implement;

import com.BC28.FinalProject.Model.ClientAfp;
import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;
import com.BC28.FinalProject.Repository.IMoneyWithdrawalRequestRepository;
import com.BC28.FinalProject.Service.IAfpService;
import com.BC28.FinalProject.Service.IClientAfpService;
import com.BC28.FinalProject.Service.IClientService;
import com.BC28.FinalProject.Service.IMoneyWithdrawalRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoneyWithdrawalRequestImpl implements IMoneyWithdrawalRequestService {

    @Autowired
    private IMoneyWithdrawalRequestRepository withdrawalRepo;

    @Autowired
    private IClientAfpService cliAfpServ;

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
    public Boolean validateWithdrawal(MoneyWithdrawalRequest withdrawal) {

        Boolean success = false;

        try{

            ClientAfp cliAfp = cliAfpServ.listById(withdrawal.getIdCliAfp());

            if(cliAfp.getTotal() < withdrawal.getTotalWithdrawal())
            {
                success = false;
            }
            else {
                success = true;
            }
        }
        catch (Exception ex){
            success = false;
        }

         return success;
    }
}
