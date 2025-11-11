package me.seungjun.springboot3backend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    final
    MemberRepository memberRepository;

    public TestService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
