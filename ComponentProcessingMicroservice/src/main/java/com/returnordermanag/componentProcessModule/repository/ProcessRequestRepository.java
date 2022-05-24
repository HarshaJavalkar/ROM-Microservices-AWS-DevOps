package com.returnordermanag.componentProcessModule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.returnordermanag.componentProcessModule.model.ProcessRequest;

@Repository
public interface ProcessRequestRepository extends JpaRepository<ProcessRequest, Integer> {

  List<ProcessRequest> findByUserName(String userName);
	
	
}
