package com.example.hb.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hb.model.Repair;
import com.example.hb.model.RepairAudit;
import com.example.hb.repo.RepairAuditRepo;
import com.example.hb.repo.RepairRepo;

@RestController
@RequestMapping
public class HomeController {

	@Autowired
	RepairRepo repo;
	@Autowired
	RepairAuditRepo auditRepo;
	
	@GetMapping("/insertuser")
	public ResponseEntity insertUser()
	{
		Repair repair=new Repair();
		Repair repair1=new Repair();
		/*RepairAudit aud=new RepairAudit();
		aud.setApprovedBy("hell");
		aud.setAuditId(1l);
		repair.setRepairId(1l);
		repair.setAudit(aud);
		repair.setRepairId(1l);
		repair.setApproverId("123");*/
		
		
		RepairAudit aud=new RepairAudit();
		aud.setApprovedBy("gre");
		//aud.setAuditId(12l);
		RepairAudit aud1=new RepairAudit();
		aud1.setApprovedBy("gr12e");
		//aud.setAuditId(122l);
		Set<RepairAudit> auditSet=new HashSet<>();
		auditSet.add(aud);
		auditSet.add(aud1);
		repair.setAudit(auditSet);
		repair.setRepairId(1l);
		repair.setApproverId("123");
		
		repo.save(repair);
		
		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/getuser")
	public ResponseEntity getUser()
	{
		
		
	Optional<Repair> r=	repo.findById(1l);
	Repair r1=r.get();	
	System.out.println(r1.getApproverId());
	
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/getaudit")
	public ResponseEntity getaudit()
	{
		
Iterable<RepairAudit>  list=	auditRepo.findAll();
	for(RepairAudit r: list)
	System.out.println(r.getApprovedBy()+" "+r.getAuditId());
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/updateRepair")
	public ResponseEntity updateRepair()
	{Repair repair=new Repair();
	RepairAudit aud=new RepairAudit();
	aud.setApprovedBy("grdasdase");
	//aud.setAuditId(12l);
	RepairAudit aud1=new RepairAudit();
	aud1.setApprovedBy("gr1dasdas2e");
	//aud.setAuditId(122l);
	Set<RepairAudit> auditSet=new HashSet<>();
	auditSet.add(aud);
	auditSet.add(aud1);
	List<RepairAudit> list=auditRepo.getByRepairId(1l);
	for(RepairAudit l:list)
	{
		System.out.println("asdas" + l.getAuditId());
		auditRepo.delete(l);
	}
	//repair.setAudit(auditSet);
	Optional<Repair> r=	repo.findById(1l);
	Repair r1=r.get();	
	r1.setAudit(auditSet);
	r1.setApproverId("1234");
	repo.save(r1);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
