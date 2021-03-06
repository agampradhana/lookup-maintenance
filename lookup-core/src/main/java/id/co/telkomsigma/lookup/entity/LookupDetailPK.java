package id.co.telkomsigma.lookup.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LOOKUP_DETAIL database table.
 * 
 */
@Embeddable
public class LookupDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="HEADER_CODE", insertable=false, updatable=false, unique=true, nullable=false, length=20)
	private String headerCode;

	@Column(name="DETAIL_CODE", unique=true, nullable=false, length=20)
	private String detailCode;

	public LookupDetailPK() {
	}
	public String getHeaderCode() {
		return this.headerCode;
	}
	public void setHeaderCode(String headerCode) {
		this.headerCode = headerCode;
	}
	public String getDetailCode() {
		return this.detailCode;
	}
	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LookupDetailPK)) {
			return false;
		}
		LookupDetailPK castOther = (LookupDetailPK)other;
		return 
			this.headerCode.equals(castOther.headerCode)
			&& this.detailCode.equals(castOther.detailCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.headerCode.hashCode();
		hash = hash * prime + this.detailCode.hashCode();
		
		return hash;
	}
}