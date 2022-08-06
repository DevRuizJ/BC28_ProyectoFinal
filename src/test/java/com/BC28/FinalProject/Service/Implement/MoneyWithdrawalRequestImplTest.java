package com.BC28.FinalProject.Service.Implement;

import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;
import com.BC28.FinalProject.Repository.IMoneyWithdrawalRequestRepository;
import com.BC28.FinalProject.Service.IClientAfpService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyWithdrawalRequestImplTest {

    @Mock
    private IMoneyWithdrawalRequestRepository withdrawalRepo;

    @InjectMocks
    private MoneyWithdrawalRequestImpl impl;

   @BeforeEach
   void setUp(){
       MockitoAnnotations.initMocks(this);
   }

    @Test
    void list() {
        List<MoneyWithdrawalRequest> resp = new ArrayList<>();
    }

    @Test
    void validateWithdrawal() {

    }
}