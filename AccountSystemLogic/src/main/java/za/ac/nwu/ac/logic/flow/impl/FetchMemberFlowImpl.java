package za.ac.nwu.ac.logic.flow.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.logic.flow.FetchMemberFlow;
import za.ac.nwu.ac.translator.MemberTranslator;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class FetchMemberFlowImpl implements FetchMemberFlow {

    private final MemberTranslator memberTranslator;

    @Autowired
    public FetchMemberFlowImpl(MemberTranslator memberTranslator) {
        this.memberTranslator = memberTranslator;
    }

    @Override
    public List<MemberDto> getMember_Name(){return null;}
    @Override
    public List<MemberDto> getMember_Email(){return null;}
    @Override
    public List<MemberDto> getMember_StartDate(){return null;}
}
