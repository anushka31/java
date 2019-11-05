import java.util.Scanner;
class Mypassword
{
void checkPassword(String str)throws Exception
{
int f=str.charAt(0);
char s=str.charAt(4);
if(f>=65 && f<=90)
{
if(s=='@'|| s=='#'||s='$'||s='&'||s=='*')

System.out.println("Strong password");

else

throw new Exception("5 char");
}

else
{
throw new Exception("1st char");
}
}
}
public class file
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Mypassword obj=new Mypassword();
String username=sc.next();
String password=sc.next();
try
{
obj.checkPassword(password);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}


