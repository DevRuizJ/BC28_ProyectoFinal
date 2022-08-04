package com.BC28.FinalProject.Repository;

import com.BC28.FinalProject.Model.MoneyWithdrawalRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMoneyWithdrawalRequestRepository extends JpaRepository<MoneyWithdrawalRequest, Integer> {
}
