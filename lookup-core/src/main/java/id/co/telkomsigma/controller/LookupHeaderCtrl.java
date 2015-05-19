package id.co.telkomsigma.controller;

import javax.validation.Valid;

import id.co.telkomsigma.lookup.entity.LookupHeader;
import id.co.telkomsigma.lookup.service.SvcLookupHeaderIntf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/lookupHeader")
public class LookupHeaderCtrl {

	@Autowired
	private SvcLookupHeaderIntf svcLookupHeaderIntf;
	
	@RequestMapping(value="/getLookupHeaderByHeaderCode",method=RequestMethod.GET)
	public ResponseEntity<LookupHeader> getLookupHeaderByCode(String headerCode){
		LookupHeader lookupHeader = svcLookupHeaderIntf.findLookupHeaderByHeaderCode(headerCode);
		return new ResponseEntity<LookupHeader>(lookupHeader, HttpStatus.OK);
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public ResponseEntity<LookupHeader> insertLookupHeader(@RequestBody @Valid LookupHeader lookupHeader){
		svcLookupHeaderIntf.insert(lookupHeader);
		return new ResponseEntity<LookupHeader>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/update/{headerCode}",method=RequestMethod.PUT)
	public ResponseEntity<LookupHeader> updateLookupHeader(
			@PathVariable("headerCode") String headerCode,
			@RequestBody @Valid LookupHeader lookupHeader){
		svcLookupHeaderIntf.update(headerCode, lookupHeader);
		return new ResponseEntity<LookupHeader>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/delete/{headerCode}",method=RequestMethod.PUT)
	public ResponseEntity<LookupHeader> deleteLookupHeader(
			@PathVariable("headerCode") String headerCode){
		svcLookupHeaderIntf.delete(headerCode);
		return new ResponseEntity<LookupHeader>(HttpStatus.NO_CONTENT);
	}
}	

