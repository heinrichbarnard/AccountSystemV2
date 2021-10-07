package za.ac.nwu.ac.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MemberDto implements Serializable {
    private static final long serialVersionUID = -3675411777951570019L;

    private String Member_Name;

    private String Member_Email;

    private LocalDate Member_StartDate;

    public MemberDto(String member_name, String member_email, LocalDate member_startDate){

        Member_Name = member_name;
        Member_Email = member_email;
        Member_StartDate = member_startDate;
    }


    public String getMember_Name() {
        return Member_Name;
    }

    public void setMember_Name(String member_Name) {
        Member_Name = member_Name;
    }

    public String getMember_Email() {
        return Member_Email;
    }

    public void setMember_Email(String member_Email) {
        Member_Email = member_Email;
    }

    public LocalDate getMember_StartDate() {
        return Member_StartDate;
    }

    public void setMember_StartDate(LocalDate member_StartDate) {
        Member_StartDate = member_StartDate;
    }
}
