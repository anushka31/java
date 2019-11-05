import java.util.Scanner;
class Array1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int e=0,o=0;
int arr[]=new int[n];
int odd[]=new int[n];
int even[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(arr[i]%2==0)
{
even[e]=arr[i];
e++;
}
else
{
odd[o]=arr[i];
o++;
}
}
for(int i=0;i<e;i++)
{
System.out.println("even no is" +even[i]);
}
for(int i=0;i<o;i++)
{
System.out.println("odd no is" +odd[i88]);
}
}
}