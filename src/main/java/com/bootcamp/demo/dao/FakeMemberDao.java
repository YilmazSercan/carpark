package com.bootcamp.demo.dao;

import com.bootcamp.demo.entity.Member;
import com.bootcamp.demo.entity.Vehicle;
import java.util.Optional;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("FakeDao")
public class FakeMemberDao implements MemberDao {

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

  @Override
  public Optional<Member> findByNumberPlate(String numberPlate) {

    return Optional.empty(); //needed to implement for now - Filiz
  }

  @Override
  public void deleteByNumberPlate(String numberPlate) {
    final Optional<Member> optionalMember = findByNumberPlate(numberPlate);
    if (optionalMember.isPresent()) {
      DB.remove(optionalMember.get().getVehicles());
      DB.remove(optionalMember);
    }
  }

}
