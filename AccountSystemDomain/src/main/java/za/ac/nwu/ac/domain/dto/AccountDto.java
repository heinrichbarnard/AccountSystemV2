package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.Account;

import java.io.Serializable;

public class AccountDto implements Serializable {
    private static final long serialVersionUID = 37681105632235880L;

    private double Total_Points;

    public AccountDto(){

    }

    public AccountDto(String AccountType_Name) {
        this.Total_Points = Total_Points;

    }

    public AccountDto(Account account){
        this.setTotal_Points(account.getTotal_Points());

    }

    private void setTotal_Points(double total_points) {
    }

    public double getAllTotal_Points() { return Total_Points;}


}
