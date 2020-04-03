package com.bootcamp.demo.api;


import com.bootcamp.demo.dto.MemberDto;
import com.bootcamp.demo.service.carParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carpark")
public class carParkController {
    private final carParkService carParkService;

    @Autowired
    public carParkController(com.bootcamp.demo.service.carParkService carParkService) {
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


}
