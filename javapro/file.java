import java.util.Scanner;
public class File
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
double f,c;
 c=s.nextDouble();
System.out.println("fare temp is =" +Conversion(c));

}
static double Conversion(double c)
{
return ((9*c)/5)+32;


}
}

