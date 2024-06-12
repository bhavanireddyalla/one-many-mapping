package com.example.BankingServices.Repository;

import com.example.BankingServices.Model.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bankinforepository extends JpaRepository<BankInfo,Integer> {
}
