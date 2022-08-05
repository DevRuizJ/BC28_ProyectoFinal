package com.BC28.FinalProject.Service;

import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;

public interface IMoneyWithdrawalRequestService extends ICRUD<MoneyWithdrawalRequest, Integer> {
    public String validateWithdrawal();
}
