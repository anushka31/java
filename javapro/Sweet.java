import java.util.Scanner;
class Sum1
{
Scanner s=new Scanner(System.in);
int num,last;
void get()
{
System.out.println("eneter a no");
num=s.nextInt();
}
void display()
{
last=num%10;
while(num>10)
num=num/10;
System.out.println("sum is"+(last+num));
}
public static void main(String args[])
{
Sum1 s=new Sum1();
s.get();
s.display();
}
}




