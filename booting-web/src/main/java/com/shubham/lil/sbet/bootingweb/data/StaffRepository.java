package com.shubham.lil.sbet.bootingweb.data;


import com.shubham.lil.sbet.bootingweb.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
