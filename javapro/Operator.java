class Operator
{
public static void main(String bla[])
{
int num1=Integer.parseInt(bla[0]);
int num2=Integer.parseInt(bla[1]);
String s=bla[2];
switch(s)
{
case "#":
System.out.println(num1*num2);
break;

case "+":
System.out.println(num1+num2);
break;
}
}
}
