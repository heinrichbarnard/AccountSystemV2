package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "MEMBER", schema = "heinrich")

public class Member implements Serializable{

    private static final long serialVersionUID = 7975750042115692601L;
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "heinrich.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    @Id
    private int Member_ID;

    private String Member_Name;

    private String Member_Email;

    private LocalDate Member_StartDate;
    private Set<Account> account;

    public Member(int member_ID, String member_Name, String member_Email, LocalDate member_StartDate) {
        this.Member_ID = member_ID;
        this.Member_Name = member_Name;
        this.Member_Email = member_Email;
        this.Member_StartDate = member_StartDate;
    }

    public Member() {
    }

    @Column(name = "MEMBER_ID")
    public int getMember_ID() {
        return Member_ID;
    }

    public void setMember_ID(int member_ID) {
        Member_ID = member_ID;
    }

    @Column(name = "MEMBER_NAME")
    public String getMember_Name() {
        return Member_Name;
    }

    public void setMember_Name(String member_Name) {
        Member_Name = member_Name;
    }

    @Column(name = "MEMBER_EMAIL")
    public String getMember_Email() {
        return Member_Email;
    }

    public void setMember_Email(String member_Email) {
        Member_Email = member_Email;
    }

    @Column(name = "MEMBER_STARTDATE")
    public LocalDate getMember_StartDate() {
        return Member_StartDate;
    }

    @OneToMany(targetEntity = Account.class, fetch = FetchType.LAZY, mappedBy = "member", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<Account> getAccount(){
        return account;
    }

    public void setAccount(Set<Account> account) {
        this.account = account;
    }
    public void setMember_StartDate(LocalDate Member_StartDate){
        this.Member_StartDate = Member_StartDate;
    }


    }

