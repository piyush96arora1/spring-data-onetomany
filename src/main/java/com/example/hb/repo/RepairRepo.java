package com.example.hb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hb.model.Repair;
@Repository
public interface RepairRepo extends JpaRepository<Repair, Long> {

}
