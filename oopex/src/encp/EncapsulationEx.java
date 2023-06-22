package encp;

class Account{
	private int accId;
	private String accName;
	private double accBal;
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccId(101);
		a1.setAccName("Rahul Gandhi");
		a1.setAccBal(5000.05);
		
		System.out.println(a1.getAccId()); 
		System.out.println(a1.getAccName());
		System.out.println(a1.getAccBal());

	}

}
