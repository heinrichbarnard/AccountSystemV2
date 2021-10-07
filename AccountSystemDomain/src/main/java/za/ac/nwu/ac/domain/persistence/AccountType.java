package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACCOUNTTYPE", schema = "heinrich")

public class AccountType implements Serializable {

    private static final long serialVersionUID = 524966047613034124L;
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "heinrich.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    @Id
    private int AccountType_ID;
    private String AccountType_Name;

    public AccountType(int accountType_ID, String accountType_Name) {
        this.AccountType_ID = accountType_ID;
        this.AccountType_Name = accountType_Name;
    }

    public AccountType() {
    }

    @Column(name = "ACCOUNTTYPE_ID")
    public int getAccountType_ID() {
        return AccountType_ID;
    }

@OneToMany(targetEntity = Account.class, fetch = FetchType.LAZY, mappedBy = "accountType", orphanRemoval = true, cascade = CascadeType.PERSIST)
public Set<Account> getAccount(){
        return account;
}

public void setAccount(Set<Account> account){
        this.account = account;
}

    public void setAccountType_ID(int accountType_ID) {
        AccountType_ID = accountType_ID;
    }

    @Column(name = "ACCOUNT_TYPE_NAME")
    public String getAccountType_Name() {
        return AccountType_Name;
    }

    public void setAccountType_Name(String accountType_Name) {
        AccountType_Name = accountType_Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return AccountType_ID == that.AccountType_ID && Objects.equals(AccountType_Name, that.AccountType_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AccountType_ID, AccountType_Name);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "AccountType_ID=" + AccountType_ID +
                ", AccountType_Name='" + AccountType_Name + '\'' +
                '}';
    }
}
