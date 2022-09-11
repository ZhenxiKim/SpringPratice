package com.example.springpratice.service;

import com.example.springpratice.domain.Member;
import com.example.springpratice.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jhkim
 * @since 2022/09/11
 */
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;//필드 인젝션

    /**
     * 회원 가입
     */
    @Transactional
    public Long join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if(!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    /*
    회원 전체 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    /*
    개별 회원 조회
     */
    public Member findOne(Long memberId) {
        return memberRepository.find(memberId);
    }
}
