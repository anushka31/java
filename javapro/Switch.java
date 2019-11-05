import java.util.Scanner;
public class Switch
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++)
{
int e=s.nextInt();
int c=s.nextInt();
int sum=0;
for(int j=i-1;j>0;j--)
{
int temp;
sum+=temp;
}
if(sum>c)
{
System.out.println("NO");
}
else
{
System.out.println("yes");
}
}
}
}




