package week3.day1.bank;

public class AxisBank extends BankInfo {
public void saving() 
{
	System.out.println("savings:"+ "1,00,000");
}
public void fixed() 
{
	System.out.println("fixed:"+ "2,00,000");
}
public void deposit()
{
	System.out.println("deposit:"+ "3,00,000");
}
public static void main(String[] args) 
{ 
	BankInfo bank=new BankInfo();
    bank.deposit();
    AxisBank axis=new AxisBank();
    axis.deposit();
}

}
