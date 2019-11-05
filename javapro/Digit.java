import java.util.Scanner;
public class Digit
{
public static void main(String args[])
{
char n;
Scanner s=new Scanner(System.in);
n=s.next().charAt(0);
if((n>=65 && n<=90)||(n>=97 && n<=122))
{
System.out.println("alphabet");
}
else if(n>=48 && n<=57)
{
System.out.println("digit");
}
else
{
System.out.println("special character");
}
}
}


