package com.shubham.lil.sbet.bootingweb.service;

import java.util.List;


import com.shubham.lil.sbet.bootingweb.data.StaffRepository;
import com.shubham.lil.sbet.bootingweb.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}