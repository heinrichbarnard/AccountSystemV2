package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACCOUNT", schema = "heinrich")

public class Account implements Serializable{

    private static final long serialVersionUID = -4773654230760877232L;
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "heinrich.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    @Id
    private int Account_ID;

    private AccountType accountType;

    private double Total_Points;

    private Member member;

    public Account(int account_ID, AccountType accountType, double total_Points, Member member) {
        this.Account_ID = account_ID;
        this.accountType = accountType;
        this.Total_Points = total_Points;
        this.member = member;
    }

    public Account() {
    }

    @Column(name = "ACCOUNT_ID")
    public int getAccount_ID() {
        return Account_ID;
    }

    public void setAccount_ID(int account_ID) {
        Account_ID = account_ID;
    }

//    @Column(name = "ACCOUNTTYPE_ID")
//    public int getAccountType_ID() {
//        return AccountType_ID;
//    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNTTYPE_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType_ID(AccountType accountType) {
        this.accountType = accountType;
    }

    @Column(name = "TOTAL_POINTS")
    public double getTotal_Points() {
        return Total_Points;
    }

    public void setTotal_Points(double total_Points) {
        Total_Points = total_Points;
    }

//    @Column(name = "MEMBER_ID")
//    public int getMember_ID() {
//        return Member_ID;
//    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    public Member getMember() {
        return member;
    }

    public void setMember_ID(Member member) {
        this.member = member;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Account_ID == account.Account_ID && Double.compare(account.Total_Points, Total_Points) == 0 && Objects.equals(accountType, account.accountType) && Objects.equals(member, account.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Account_ID, accountType, Total_Points, member);
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account_ID=" + Account_ID +
                ", accountType=" + accountType +
                ", Total_Points=" + Total_Points +
                ", member=" + member +
                '}';
    }
}

