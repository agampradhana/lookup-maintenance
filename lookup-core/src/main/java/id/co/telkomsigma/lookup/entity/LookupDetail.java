package id.co.telkomsigma.lookup.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LOOKUP_DETAIL database table.
 * 
 */
@Entity
@Table(name="LOOKUP_DETAIL")
@NamedQuery(name="LookupDetail.findAll", query="SELECT l FROM LookupDetail l")
public class LookupDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LookupDetailPK id;

	@Column(name="ABBR_DESC", length=20)
	private String abbrDesc;

	@Column(length=150)
	private String description;

	@Column(name="\"VALUE\"", length=100)
	private String value;

	//bi-directional many-to-one association to LookupHeader
	@ManyToOne
	@JoinColumn(name="HEADER_CODE", nullable=false, insertable=false, updatable=false)
	private LookupHeader lookupHeader;

	public LookupDetail() {
	}

	public LookupDetailPK getId() {
		return this.id;
	}

	public void setId(LookupDetailPK id) {
		this.id = id;
	}

	public String getAbbrDesc() {
		return this.abbrDesc;
	}

	public void setAbbrDesc(String abbrDesc) {
		this.abbrDesc = abbrDesc;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LookupHeader getLookupHeader() {
		return this.lookupHeader;
	}

	public void setLookupHeader(LookupHeader lookupHeader) {
		this.lookupHeader = lookupHeader;
	}

}