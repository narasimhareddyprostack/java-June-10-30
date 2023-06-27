package oop;

public class Demo {

	public static void main(String[] args) {
	SA a1=new SA();//Rahul
	a1.setAcc_Id(101);
	a1.setAcc_Name("Rahul");
	a1.setAcc_Bal(6000.00);
	a1.setMin_Bal(500.00);
	//calculate bal
	//a1.cal_Bal();
	System.out.println("Account Holder Name :"+a1.getAcc_Name());
	AccountService.accountinfo(a1);
	
	CA a2=new CA();//Priyanka
	a2.setAcc_Id(201);
	a2.setAcc_Name("Priyanka");
	a2.setAcc_Bal(60000.00);
	a2.setMin_Bal(5000.00);
	System.out.println("Account Holder Name :"+a2.getAcc_Name());
	//a2.cal_Bal();
	
	
	AccountService.accountinfo(a2);

	}

}
