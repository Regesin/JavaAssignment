package InheritanceDemos;

public class SavingsAccount extends Account {
	private String orgName;

	public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		super(accName, accNo, bankName);
		this.orgName = orgName;
		
	}
	public void display() {
		super.display();
		System.out.println("Org Name : "+orgName);
	}
	
}
