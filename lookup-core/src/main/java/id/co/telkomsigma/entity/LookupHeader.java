package id.co.telkomsigma.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the LOOKUP_HEADER database table.
 * 
 */
@Entity
@Table(name="LOOKUP_HEADER")
@NamedQuery(name="LookupHeader.findAll", query="SELECT l FROM LookupHeader l")
public class LookupHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="HEADER_CODE")
	private String headerCode;

	@Column(name="ACTIVE_STATUS")
	private String activeStatus;

	private String description;

	//bi-directional many-to-one association to LookupDetail
	@OneToMany(mappedBy="lookupHeader")
	@JsonIgnore
	private List<LookupDetail> lookupDetails;

	public LookupHeader() {
	}

	public String getHeaderCode() {
		return this.headerCode;
	}

	public void setHeaderCode(String headerCode) {
		this.headerCode = headerCode;
	}

	public String getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<LookupDetail> getLookupDetails() {
		return this.lookupDetails;
	}

	public void setLookupDetails(List<LookupDetail> lookupDetails) {
		this.lookupDetails = lookupDetails;
	}

	public LookupDetail addLookupDetail(LookupDetail lookupDetail) {
		getLookupDetails().add(lookupDetail);
		lookupDetail.setLookupHeader(this);

		return lookupDetail;
	}

	public LookupDetail removeLookupDetail(LookupDetail lookupDetail) {
		getLookupDetails().remove(lookupDetail);
		lookupDetail.setLookupHeader(null);

		return lookupDetail;
	}

}