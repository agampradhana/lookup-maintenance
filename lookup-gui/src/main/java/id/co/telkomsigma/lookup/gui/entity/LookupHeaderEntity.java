package id.co.telkomsigma.lookup.gui.entity;

public class LookupHeaderEntity {
	private String code;
	private String description;
	private String status;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LookupHeaderEntity [code=" + code + ", description="
				+ description + ", status=" + status + "]";
	}
	
	
}
