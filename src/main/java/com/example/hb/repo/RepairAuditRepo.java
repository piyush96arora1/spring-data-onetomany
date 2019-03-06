package com.example.hb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.hb.model.Repair;
import com.example.hb.model.RepairAudit;

public interface RepairAuditRepo extends JpaRepository<RepairAudit, Long> {
@Query("select r from RepairAudit r where r.repairid= :repairid")
public List<RepairAudit> getByRepairId(@Param("repairid") long repairid);

}
