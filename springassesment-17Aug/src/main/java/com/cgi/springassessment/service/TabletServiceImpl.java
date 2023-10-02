package com.cgi.springassessment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.springassessment.model.Tablet;
import com.cgi.springassessment.repository.TabletRepository;

@Service
public class TabletServiceImpl implements TabletService{
	
	@Autowired
	TabletRepository tabletRepository;

	@Override
	public Tablet addTablet(Tablet tablet) {
		return tabletRepository.save(tablet);
	}

	@Override
	public List<Tablet> getAllTablets() {
		// TODO Auto-generated method stub
		return (List<Tablet>)tabletRepository.findAll();
	}

	@Override
	public void deleteTabletById(int tabletId) {
		// TODO Auto-generated method stub
		tabletRepository.deleteById(tabletId);
	}
	
}
