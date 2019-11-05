import java.util.Scanner;
class Name
{
Scanner s=new Scanner(System.in);
String arr[]= new String[10];
int n=s.nextInt();
void details()
{
System.out.print("enter the name");
for(int i=0;i<n;i++)
{
arr[i]=s.next();
}
}

void sort()
{
String temp;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i].charAt(0)>arr[j].charAt(0))
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.println(arr[i]);
}
}
public static void main(String args[])
{
Name n=new Name();
n.details();
n.sort();

}
}
