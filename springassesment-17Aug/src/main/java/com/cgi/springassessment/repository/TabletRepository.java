package com.cgi.springassessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cgi.springassessment.model.Tablet;

@Repository
public interface TabletRepository extends CrudRepository<Tablet,Integer>{
    
	       
}
