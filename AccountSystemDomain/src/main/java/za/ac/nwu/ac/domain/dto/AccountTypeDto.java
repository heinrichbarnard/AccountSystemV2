package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;

public class AccountTypeDto implements Serializable {

    private static final long serialVersionUID = 1758989559971239011L;
    private String AccountType_Name;

    public AccountTypeDto(){

    }

    public AccountTypeDto(String AccountType_Name) {
        this.AccountType_Name = AccountType_Name;

    }

    public AccountTypeDto(AccountType accountType){
        this.setAccountType_Name(accountType.getAccountType_Name());

    }

    public String getAccountType_Name() { return AccountType_Name;}

    private void setAccountType_Name(String accountType_name) {
    }
}
