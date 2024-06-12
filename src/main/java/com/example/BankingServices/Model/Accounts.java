package com.example.BankingServices.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Accounts")

public class Accounts {
    @Id
    public int id;
    public int bankcode;
    public String bankname;
    public String accountnumber;
    public String accounttype;
    public double balance;
    public String accountholdername;
    public String accountholderphonenumber;
    public String accountholderpassword;
    public String accountholderemail;


}
