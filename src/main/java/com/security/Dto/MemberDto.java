package com.security.Dto;

import com.security.Entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto
{
    private String userId; // 아이디
    private String password; // 비밀번호
    private int age; // 나이

    // Dto -> Entity
    public Member createEntity()
    {
        Member member = new Member();
        member.setAge(this.age);
        member.setPassword(this.password);
        member.setUserId(this.userId);
        return member;
    }

    // Entity -> Dto
    public static MemberDto of(Member member)
    {
        MemberDto memberDto = new MemberDto();
        member.setAge(memberDto.getAge());
        member.setPassword(memberDto.getPassword());
        member.setUserId(memberDto.userId);
        return memberDto;
    }
}
