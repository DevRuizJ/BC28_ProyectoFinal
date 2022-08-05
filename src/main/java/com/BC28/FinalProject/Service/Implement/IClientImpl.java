package com.BC28.FinalProject.Service.Implement;

import com.BC28.FinalProject.Model.Client;
import com.BC28.FinalProject.Repository.IAfpRepository;
import com.BC28.FinalProject.Repository.IClientRepository;
import com.BC28.FinalProject.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IClientImpl implements IClientService {

    @Autowired
    private IClientRepository cliRepo;

    @Override
    public Client register(Client obj) {
        return cliRepo.save(obj);
    }

    @Override
    public Client modify(Client obj) {
        return cliRepo.save(obj);
    }

    @Override
    public List<Client> list() {
        return cliRepo.findAll();
    }

    @Override
    public Client listById(Integer id) {
        Optional<Client> op = cliRepo.findById(id);
        return op.isPresent() ? op.get() : new Client();
    }

    @Override
    public boolean delete(Integer id) {
        cliRepo.deleteById(id);
        return true;
    }
}
