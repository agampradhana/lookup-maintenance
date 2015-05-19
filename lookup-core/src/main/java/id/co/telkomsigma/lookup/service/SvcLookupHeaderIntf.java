package id.co.telkomsigma.lookup.service;

import id.co.telkomsigma.lookup.entity.LookupHeader;

public interface SvcLookupHeaderIntf {
	public LookupHeader findLookupHeaderByHeaderCode(String headerCode); 
	public void insert(LookupHeader lookupHeader);	
	public void update(String headerCode, LookupHeader lookupHeader);
	public void delete(String headerCode);
}
