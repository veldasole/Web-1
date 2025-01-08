package domain;

public class Account {
	
	private Long id;
	
	private Long idBank;
	
	private Bank bank;
	
	private Long idAgreement;
	
	private Agreement agreement;
	
	private Long idTypeAccount;
	
	private TypeAccount typeAccount;
	
	private Long account;
	
	public Account() {
	}
	
	public Account(Bank bank, Agreement agreement, TypeAccount typeAccount, Long account) {
		this.bank = bank;
		this.agreement = agreement;
		this.typeAccount = typeAccount;
		this.account = account;
	}
	
	public Account(Long idBank, Bank bank, Long idAgreement, Agreement agreement, 
			Long idTypeAccount, TypeAccount typeAccount, Long account) {
		this.idBank = idBank;
		this.bank = bank;
		this.idAgreement = idAgreement;
		this.agreement = agreement;
		this.idTypeAccount = idTypeAccount;
		this.typeAccount = typeAccount;
		this.account = account;
		
	}
	
	public Account(Long id, Long idBank, Bank bank, Long idAgreement, Agreement agreement, 
			Long idTypeAccount, TypeAccount typeAccount, Long account) {
		this.id = id;
		this.idBank = idBank;
		this.bank = bank;
		this.idAgreement = idAgreement;
		this.agreement = agreement;
		this.idTypeAccount = idTypeAccount;
		this.typeAccount = typeAccount;
		this.account = account;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Bank bank() {
		return bank;
	}
	
	public String getBank() {
		return bank.getNameShort();
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public Long getIdBank() {
		return idBank;
	}
	
	public void setIdBank(Long idBank) {
		this.idBank = idBank;
	}
//	*****
	public Agreement agreement() {
		return agreement;
	}
	
	public Long getAgreement() {
		return agreement.getNumber();
	}
	
	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}
	
	public Long getIdAgreement() {
		return idAgreement;
	}
	
	public void setIdAgreement(Long idAgreement) {
		this.idAgreement = idAgreement;
	}
//	*****
	public TypeAccount typeAccount() {
		return typeAccount;
	}
	
	public String getTypeAccount() {
		return typeAccount.getType();
	}
	
	public void setTypeAccount(TypeAccount typeAccount) {
		this.typeAccount = typeAccount;
	}
	
	public Long getIdTypeAccount() {
		return idTypeAccount;
	}
	
	public void setIdTypeAccount(Long idTypeAccount) {
		this.idTypeAccount = idTypeAccount;
	}
	
	public Long getAccount() {
		return account;
	}
	
	public void setAccount(Long account) {
		this.account = account;
	}
	
	public String toString() {
		return "Bank {" + "Id = " + id + 
				", IdBank = " + idBank +
				", Bank = "+ getBank() +
				", IdAgreement = "+ idAgreement +
				", Agreement = "+ getAgreement() +
				", IdTypeAccount = "+ idTypeAccount +
				", TypeAccount = "+ getTypeAccount() +
				", Account = "+ account;
	}
	
}
