package oop;

public class SA extends Account {
	private double min_Bal;
	//generate setters and getters

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public void cal_Bal(){
		double bal  = getAcc_Bal();
		bal = bal - getMin_Bal();
		System.out.println("Account Bal"+bal);
	}
	
}
