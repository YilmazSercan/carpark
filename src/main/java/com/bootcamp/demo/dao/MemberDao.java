package com.bootcamp.demo.dao;

import com.bootcamp.demo.entity.Member;
import com.bootcamp.demo.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public interface MemberDao {

  public int save(Member member);

  public List<Member> findAll();

  //Alican
  //  public List<Vehicle> findAllVehicles();

  //Sercan
  public Optional<Member> findByNumberPlate(String numberPlate);

  //Muammer
  //   public List<String> findAllMembersName();

  //Zeynel
  //  public Member UpdateByNumberPlate(String numberPlate);

 // public void delete(Optional<Member> member);

  public void deleteByNumberPlate(String numberPlate);
}
