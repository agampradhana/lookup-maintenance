package id.co.telkomsigma.lookup.service;

import id.co.telkomsigma.lookup.entity.LookupDetail;

import java.util.List;

public interface SvcLookupDetailIntf {
	public List<LookupDetail> findLookupDetailByHeaderCode(String headerCode); 
	public void insert(LookupDetail lookupDetail);	
	public void update(String detailCode, LookupDetail lookupDetail);
	public void delete(String detailCode);
}
