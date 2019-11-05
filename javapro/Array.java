import java.util.Scanner;
class Array
{
Scanner s=new Scanner(System.in);
int n;
void sort()
{
System.out.println("enter no of elemnts");
n=s.nextInt();
int arr[]=new int[n];
int temp=0;
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}

for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]>arr[j])  
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}

System.out.println("sorted element"+arr[i]);
}
}
public static void main(String args[])
{
Array c =new Array();
c.sort();
}
}

