package domain;

public class TypeAccount {
	
	private Long id;
	
	private String type;
	
	public TypeAccount() {
	}
	
	public TypeAccount (String type) {
		this.type = type;
	}
	
	public TypeAccount (Long id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "TypeAccount {" + "Id = " + id + ", Type = " 
	+ type + "}";
	}
	
}
