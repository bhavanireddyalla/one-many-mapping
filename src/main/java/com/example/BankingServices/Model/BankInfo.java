package com.example.BankingServices.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name ="Bank_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankInfo {
    @Id
    @GeneratedValue
    public int id;
    public int bankcode;
    public String name;
    public String address;
    public String phone;
    public String email;
    public String branch;
    public String ifsc;
    public String bankname;
    public String website;
    @OneToMany(targetEntity = Accounts.class,cascade = CascadeType.ALL)
     @JoinColumn(name = "bank_id", referencedColumnName = "bankcode")
    public List<Accounts> account;




}
