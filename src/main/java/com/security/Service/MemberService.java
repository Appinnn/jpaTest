package com.security.Service;

import com.security.Dto.MemberDto;
import com.security.Entity.Member;
import com.security.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService
{
    @Autowired
    private MemberRepository memberRepository;

    public void 회원가입처리(MemberDto memberDto)
    {
        Member member = memberDto.createEntity();

        memberRepository.save(member);
    }
}
