package id.co.telkomsigma.lookup.repo;

import id.co.telkomsigma.lookup.entity.LookupHeader;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (collectionResourceRel = "lookupHeader", path="lookupHeader")
public interface RepoLookupHeaderIntf extends JpaRepository<LookupHeader, String> {
	

}
