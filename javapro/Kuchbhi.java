import java.util.Scanner;
public class Kuchbhi
{
Scanner s=new Scanner(System.in);
int n;
void get_details()
{
System.out.println("enter the number");
n=s.nextInt();
}


void compute()
{
int count=0;
int evencount=0;
int oddcount=0;
while(n>0)
{
if(n%10==0)
{
count++;
}
 else if((n%10)%2==0)
{
evencount++;
}
else
{
oddcount++;
}
n=n/10;
}
System.out.println("zero = "+count);
System.out.println("even = "+evencount);
System.out.println("odd = "+oddcount);
}
public static void main(String args[])
{
Kuchbhi k=new Kuchbhi();
k.get_details();
k.compute();
}
}

