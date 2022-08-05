package com.BC28.FinalProject.Service.Implement;

import com.BC28.FinalProject.Model.ClientAfp;
import com.BC28.FinalProject.Repository.IClientAfpRepository;
import com.BC28.FinalProject.Service.IClientAfpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientAfpImpl implements IClientAfpService {

    @Autowired
    private IClientAfpRepository cliAfpRepo;

    @Override
    public ClientAfp register(ClientAfp obj) {
        return cliAfpRepo.save(obj);
    }

    @Override
    public ClientAfp modify(ClientAfp obj) {
        return cliAfpRepo.save(obj);
    }

    @Override
    public List<ClientAfp> list() {
        return cliAfpRepo.findAll();
    }

    @Override
    public ClientAfp listById(Integer id) {
        Optional<ClientAfp> op = cliAfpRepo.findById(id);
        return op.isPresent() ? op.get() : new ClientAfp();
    }

    @Override
    public boolean delete(Integer id) {
        cliAfpRepo.deleteById(id);
        return true;
    }
}
