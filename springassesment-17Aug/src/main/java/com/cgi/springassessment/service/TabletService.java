package com.cgi.springassessment.service;

import java.util.List;
import com.cgi.springassessment.model.Tablet;

public interface TabletService {
     
	Tablet addTablet(Tablet tablet);
	
    List<Tablet> getAllTablets();
   
    void deleteTabletById(int tabletId);

}
