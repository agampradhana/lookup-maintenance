package id.co.telkomsigma.lookup.service;

import id.co.telkomsigma.lookup.entity.LookupHeader;
import id.co.telkomsigma.lookup.repo.RepoLookupHeaderIntf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SvcLookupHeaderImpl implements SvcLookupHeaderIntf {

	@Autowired
	private RepoLookupHeaderIntf lookupHeaderRepo;
	
	@Override
	public LookupHeader findLookupHeaderByHeaderCode(String headerCode) {
		// TODO Auto-generated method stub
		return lookupHeaderRepo.findOne(headerCode);
	}

	@Override
	public void insert(LookupHeader lookupHeader) {
		// TODO Auto-generated method stub
		lookupHeaderRepo.save(lookupHeader);
	}

	@Override
	public void update(String headerCode, LookupHeader lookupHeader) {
		// TODO Auto-generated method stub
		LookupHeader lookupHeaderUpdate = lookupHeaderRepo.findOne(headerCode);
		lookupHeaderUpdate.setDescription(lookupHeader.getDescription());
		lookupHeaderUpdate.setActiveStatus(lookupHeader.getActiveStatus());
		lookupHeaderUpdate.setLookupDetails(lookupHeader.getLookupDetails());
		lookupHeaderRepo.save(lookupHeader);
	}

	@Override
	public void delete(String headerCode) {
		// TODO Auto-generated method stub
		lookupHeaderRepo.delete(headerCode);
	}

}
