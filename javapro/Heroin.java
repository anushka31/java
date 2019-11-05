import java.util.Scanner;
public class Heroin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int mrks=s.nextInt();
if(mrks<50)
{
System.out.println("fail");
}
else if(mrks>=50 && mrks<60)
{
System.out.println("D grade");
}
else if(mrks>=60 && mrks<70)
{
System.out.println("c grade");
}
else if(mrks>=70 && mrks<80)
{
System.out.println("Bgrade");
}
else if(mrks>=80 && mrks<90)
{
System.out.println("good");
}
else
{
System.out.println("Invalid");
}
}
}
