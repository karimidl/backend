package com.server.hr.reposi;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.hr.model.Leave;


public interface ConjeRepo extends JpaRepository<Leave,Long>{
	
	
	  Optional<Leave> findConjeById(Long id);
	  void deleteConjeById(Long id);


}
