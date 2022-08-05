package com.BC28.FinalProject.Service.Implement;

import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;
import com.BC28.FinalProject.Repository.IMoneyWithdrawalRequestRepository;
import com.BC28.FinalProject.Service.IMoneyWithdrawalRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IMoneyWithdrawalRequestImpl implements IMoneyWithdrawalRequestService {

    @Autowired
    private IMoneyWithdrawalRequestRepository repository;


    @Override
    public MoneyWithdrawalRequest register(MoneyWithdrawalRequest obj) {
        return repository.save(obj);
    }

    @Override
    public MoneyWithdrawalRequest modify(MoneyWithdrawalRequest obj) {
        return repository.save(obj);
    }

    @Override
    public List<MoneyWithdrawalRequest> list() {
        return repository.findAll();
    }

    @Override
    public MoneyWithdrawalRequest listById(Integer id) {
        Optional<MoneyWithdrawalRequest> op = repository.findById(id);
        return op.isPresent() ? op.get() : new MoneyWithdrawalRequest();
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public String validateWithdrawal() {
        return null;
    }
}
