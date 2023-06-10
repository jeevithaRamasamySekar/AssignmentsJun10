package bank;

public class AxisBank extends BankInfo
{
    public void deposit()
    {
    	int loan=100;
    	System.out.println("Deposit along with loan amt"+ loan);
    }
    
	public static void main(String[] args) 
	{
		AxisBank obj=new AxisBank();
		obj.Saving();
		obj.fixed();
		obj.deposit();
	}

}
