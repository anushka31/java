	class Interest
	{
	int accno;
	String username;
	float balance;
	static float interestRate;

	static
	{
	interestRate=6.5f;
	}


	static void changeInterest(float newRate)
	{
	interestRate=newRate;
	}

	Interest(int accno,String username,float balance)
	{
this.accno=accno;
this.username=username;
this.balance=balance;
}

void getDetails()
{
System.out.println("account no:"+accno);
System.out.println("Username:" +username);
balance=balance+(balance*interestRate/100);
System.out.println("Balance:"+balance);
}
public static void main(String args[])
{
Interest i1=new Interest(1,"Harry",100);
Interest i2=new Interest(2,"anu",200);
i1.getDetails();
i2.getDetails();
Interest.changeInterest(9.5f);
i1.getDetails();
i2.getDetails()
}
}
