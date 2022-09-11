package com.example.springpratice.repository;

import com.example.springpratice.domain.Member;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author jhkim
 * @since 2022/09/06
 */
@Repository
public class MemberRepository {
    @PersistenceContext//어노테이션 설정으로 스프링이 entityManager 주입
    private EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .getResultList();
        //jpql 객체를 대상으로 쿼리 조회
    }

    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}
