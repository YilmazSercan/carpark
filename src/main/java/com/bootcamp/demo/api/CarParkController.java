package com.bootcamp.demo.api;

import com.bootcamp.demo.dto.MemberDto;
import com.bootcamp.demo.service.CarParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carpark")

public class CarParkController {

  private final CarParkService carParkService;

  @Autowired
  public CarParkController(CarParkService carParkService) {
    this.carParkService = carParkService;
  }

  @PostMapping
  public void addMember(@RequestBody MemberDto memberDto) {
    carParkService.addMember(memberDto);

  }

  @GetMapping()
  public List<MemberDto> getAllMembers() {
    return carParkService.getAllMembers();
  }

  @DeleteMapping(value = "/deleteMember/{numberPlate}")
  public void deleteMemberRequest(@PathVariable String numberPlate) {
    carParkService.deleteMember(numberPlate);
  }
}
