import java.util.Scanner;
public class Else
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int age=s.nextInt();
int weht=s.nextInt();
if(age>=18)
{
if(weht>50)
{
System.out.println("u r elliglible");
}
else
{
System.out.println("u r not");
}
}
else
{
System.out.println("greater than 18");
}
}
}

