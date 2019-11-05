import java.util.Scanner;
class Customer
{
int accno;
String username;
float bal;
}
public class Person
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Customer c[]=new Customer[10];
Person()
{
for(int i=0;i<n;i++)
{
c[i]=new Customer();
}
}
void details()
{
for(int i=0;i<n;i++)
{
System.out.println("enetr accno");
c[i].accno=s.nextInt();
System.out.println("enter username");
c[i].username=s.next();
System.out.println("enetr balance");
c[i].bal=s.nextFloat();
}
}
void print()
{
for(int i=0;i<n;i++)
{
if(c[i].bal<100)
{
System.out.println("account no is" +c[i].accno);
System.out.println("name is" +c[i].username);
}
}
}
public static void main(String args[])
{
Person p=new Person();
p.details();
p.print();
}
}


