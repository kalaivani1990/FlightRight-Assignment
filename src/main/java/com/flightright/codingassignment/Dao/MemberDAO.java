package com.flightright.codingassignment.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightright.codingassignment.Model.Member;
import com.flightright.codingassignment.Repository.MemberRepository;

@Service
public class MemberDAO {

	@Autowired
	MemberRepository memberRepository;

	/* to create a new member */
	public Member save(Member mem) {
		return memberRepository.save(mem);
	}

	/* to list existing members */
	public List<Member> findAll() {
		return memberRepository.findAll();
	}

	/* to read an existing member */
	public Member findOne(Long empid) {
		return memberRepository.findOne(empid);
	}

	/* to delete a member whi no longer exists */
	public void delete(Member emp) {
		memberRepository.delete(emp);
	}
}
