package domain;

public class Bank {
	
	private Long id;
	
	private String nameFull;
	
	private String nameShort;
	
	private Long inn;
	
	private Long bik;
	
	private Long corAccount;
	
	private Long account;
	
	private String city;
	
	public Bank() {
	}
	
	public Bank(Long id, String nameFull, String nameShort, Long inn, 
			Long bik, Long corAccount, Long account, String city) {
		this.id = id;
		this.nameFull = nameFull;
		this.nameShort = nameShort;
		this.inn = inn;
		this.bik = bik;
		this.corAccount = corAccount;
		this.account = account;
		this.city = city;
	}
	
	public Bank(String nameFull, String nameShort, Long inn, 
			Long bik, Long corAccount, Long account, String city) {
		this.nameFull = nameFull;
		this.nameShort = nameShort;
		this.inn = inn;
		this.bik = bik;
		this.corAccount = corAccount;
		this.account = account;
		this.city = city;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNameFull() {
		return nameFull;
	}
	
	public void setNameFull(String nameFull) {
		this.nameFull = nameFull;
	}
	
	public String getNameShort() {
		return nameShort;
	}
	
	public void setNameShort(String nameShort) {
		this.nameShort = nameShort;
	}
	
	public Long getInn() {
		return inn;
	}
	
	public void setInn(Long inn) {
		this.inn = inn;
	}
	
	public Long getBik() {
		return bik;
	}
	
	public void setBik(Long bik) {
		this.bik = bik;
	}
	
	public Long getCorAccount() {
		return corAccount;
	}
	
	public void setCorAccount(Long corAccount) {
		this.corAccount = corAccount;
	}
	
	public Long getAccount() {
		return account;
	}
	
	public void setAccount(Long account) {
		this.account = account;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return "Bank {" + "Id = " + id + 
				", NameFull = " + nameFull +
				", NameShort = "+ nameShort +
				", Inn = "+ inn +
				", Bik = "+ bik +
				", CorAccount = "+ corAccount +
				", Account = "+ account +
				", City = "+ city;
	}
}
