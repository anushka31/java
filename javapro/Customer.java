import java.util.Scanner;
class Customer
{
 	Scanner s=new Scanner(System.in);
 	int acc_no[]=new int[10];
 	String name[]=new String[10];
 	double balc[]=new double[10];

	void Details() {
           
            for(int i=0;i<=3;i++){
	System.out.println("enetr account no");
		acc_no[i]=s.nextInt();
	System.out.println("enter a name");
		name[i]=s.next();
	System.out.println("enter balc");
		balc[i]=s.nextDouble();
	
	}
			
	
}
	void check(){
	for(int i=0;i<=3;i++){	
 	
	if(balc[i]<100){
	System.out.println(name[i]);
	 }
   }
}
public static void main(String args[])
{
Customer c=new Customer();
c.Details();
c.check();
}
}

	