package com.bootcamp.demo.service;

import com.bootcamp.demo.dao.FakeMemberDao;
import com.bootcamp.demo.dto.MemberDto;
import com.bootcamp.demo.dto.VehicleDto;
import com.bootcamp.demo.entity.Member;
import com.bootcamp.demo.entity.Vehicle;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarParkService {

  private final FakeMemberDao fakeMemberDao;

  @Autowired
  public CarParkService(FakeMemberDao fakeMemberDao) {
    this.fakeMemberDao = fakeMemberDao;
  }

  public int addMember(MemberDto memberDto) {
    List<Vehicle> vehicles = memberDto.getVehicles().stream()
        .map(vehicleDto -> new Vehicle(vehicleDto.getNumberPlate(), vehicleDto.getType(),
            vehicleDto.getModel()
            , vehicleDto.getColor(), vehicleDto.getDeadLine())).collect(Collectors.toList());

    return fakeMemberDao.save(
        new Member(memberDto.getName(), memberDto.getPhoneNumber(), memberDto.getAddress(),
            vehicles));
  }

  public List<MemberDto> getAllMembers() {
    List<Member> memberList = fakeMemberDao.findAll();
    List<MemberDto> returnList = new ArrayList<>();

    memberList.forEach(member -> {
          List<VehicleDto> vehicledtos = new ArrayList<>();
          member.getVehicles().forEach(
              vehicle -> {
                vehicledtos
                    .add(new VehicleDto(vehicle.getNumberPlate(), vehicle.getType(), vehicle.getModel()
                        , vehicle.getColor(), vehicle.getDeadLine()));
              }
          );
          returnList.add(new MemberDto(member.getName(), member.getPhoneNumber(), member.getAddress(),
              vehicledtos));
        }
    );
    return returnList;
  }

  public void deleteMember(String numberPlate) {
    fakeMemberDao.deleteByNumberPlate(numberPlate);
  }

}
