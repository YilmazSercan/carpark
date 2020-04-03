package com.bootcamp.demo.dao;

import com.bootcamp.demo.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("FakeDao")
public class FakeMemberDao implements MemberDao{
    List<Member> DB = new ArrayList<>();

    @Override
    public int save(Member member) {
        DB.add(member);
        return 1;
    }

    @Override
    public List<Member> findAll() {

        return DB;
    }
}
