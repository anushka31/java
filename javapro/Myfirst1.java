import java.util.Scanner;
public class Myfirst1
{
public static void main(String args[])
{
try
{
String s=null;
System.out.println(s.length());
}
catch(NullPointerException e)
{
System.out.println(e);
}
String s1="abc";
System.out.println(s1.length());
}}