package com.cgi.springassessment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cgi.springassessment.model.Tablet;
import com.cgi.springassessment.service.TabletService;

@RestController
@RequestMapping("/tablet")

public class TabletController {
	@Autowired
	TabletService tabletService;

	@GetMapping
	public ResponseEntity<?> getalltablets() {
		List<Tablet> tabletlist = tabletService.getAllTablets();

		ResponseEntity<List<Tablet>> responsedata = null;

		if (tabletlist.size() > 0)
			responsedata = new ResponseEntity<List<Tablet>>(tabletlist, HttpStatus.OK);
		else
			return new ResponseEntity<String>("Empty list", HttpStatus.OK);

		return responsedata;
	}

	@PostMapping
	public ResponseEntity<Tablet> addnote(@RequestBody Tablet tablet) {

		Tablet newtablet = tabletService.addTablet(tablet);

		ResponseEntity<Tablet> responsedata = new ResponseEntity<Tablet>(newtablet, HttpStatus.CREATED);
		return responsedata;
	}

	@DeleteMapping("/{tabletId}")
	public ResponseEntity<String> deleteTabletById(@PathVariable int tabletId) {
		tabletService.deleteTabletById(tabletId);
		return ResponseEntity.status(HttpStatus.OK).body("Tablet deleted successfully.");
	}

}
