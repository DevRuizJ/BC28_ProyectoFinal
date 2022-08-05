package com.BC28.FinalProject.Service.Implement;

import com.BC28.FinalProject.Model.Afp;
import com.BC28.FinalProject.Model.Client;
import com.BC28.FinalProject.Repository.IAfpRepository;
import com.BC28.FinalProject.Repository.IMoneyWithdrawalRequestRepository;
import com.BC28.FinalProject.Service.IAfpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AfpImpl implements IAfpService {

    @Autowired
    private IAfpRepository afpRepo;

    @Override
    public Afp register(Afp obj) {
        return afpRepo.save(obj);
    }

    @Override
    public Afp modify(Afp obj) {
        return afpRepo.save(obj);
    }

    @Override
    public List<Afp> list() {
        return afpRepo.findAll();
    }

    @Override
    public Afp listById(Integer id) {
        Optional<Afp> op = afpRepo.findById(id);
        return op.isPresent() ? op.get() : new Afp();
    }

    @Override
    public boolean delete(Integer id) {
        afpRepo.deleteById(id);
        return true;
    }
}
