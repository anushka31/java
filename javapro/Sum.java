import java.util.Scanner;
public class Sum
{
public static void main(String args[])
{
int sum=0,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
sum=sum+n%10;
n=n/10;
}
System.out.println(sum);
}
}