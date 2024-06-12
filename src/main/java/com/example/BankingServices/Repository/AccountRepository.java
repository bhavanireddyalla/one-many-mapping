package com.example.BankingServices.Repository;

import com.example.BankingServices.Model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Accounts,Integer> {
}
