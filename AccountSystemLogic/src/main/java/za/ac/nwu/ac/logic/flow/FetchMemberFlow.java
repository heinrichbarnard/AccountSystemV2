package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.MemberDto;

import java.util.List;

public interface FetchMemberFlow {
    List<MemberDto> getMember_Name();

    List<MemberDto> getMember_Email();

    List<MemberDto> getMember_StartDate();
}
