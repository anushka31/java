import java.util.Scanner;
class Insert
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("enter size");
int n=s.nextInt();
int arr[]=new int[n+1];
int pos,x;

System.out.println("enter no of elemnts");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}

System.out.println("enter position");
pos=s.nextInt();

System.out.println("enter element you want to enter");
x=s.nextInt();

for(int i=n-1;i>=(pos-1);i--)
{
arr[i+1]=arr[i];
}
arr[pos-1]=x;

for(int i=0;i<=n;i++)
{
System.out.println(arr[i]);
}
}

}



                                                           