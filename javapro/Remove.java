import java.util.Scanner;
class Remove
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("eneter size");
int n=s.nextInt();
System.out.println("eneter elements of array");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{98i  
arr[i]=s.nextInt();
}
System.out.println("eneter position");
int pos=s.nextInt();
for(int i=pos;i<n-1;i++)
{
arr[i]=arr[i+1];
}
System.out.println("new array is");
for(int i=0;i<n-1;i++)
{
System.out.println(arr[i]);
}
}
}
