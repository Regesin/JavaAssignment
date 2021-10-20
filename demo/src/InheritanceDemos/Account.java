package InheritanceDemos;

public class Account {
	protected String accName;
	protected String accNo;
	protected String bankName;

	Account(String accName, String accNo, String bankName) {
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;

	}
	/*protected void getDetails(){
		System.out.println("Account Name"+accName);
		System.out.println("Account Number "+accNo);
		System.out.println("BankName "+bankName);

	}*/
	protected void display() {
		System.out.println("Account Name : "+accName);
		System.out.println("Account Number: "+accNo);
		System.out.println("Bank Name : "+bankName);

		
	}

}
