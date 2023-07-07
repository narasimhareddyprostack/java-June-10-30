package langex;

public class Account {
	private int acc_Id;
	private String acc_Name;
	//generating setters and getters
	
	//overing the object class tostring
	
	
	public int getAcc_Id() {
		return acc_Id;
	}

	@Override
	public String toString() {
		return "Account [acc_Id=" + acc_Id + ", acc_Name=" + acc_Name + "]";
	}

	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}

	public String getAcc_Name() {
		return acc_Name;
	}

	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	
	public static void main(String[] args) {
	Account a1 = new Account();
	a1.setAcc_Id(101);
	a1.setAcc_Name("RahulGandhi");
	System.out.println(a1.toString());

	}


}
