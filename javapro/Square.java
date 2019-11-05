import java.util.Scanner;
class Rectangle
{
int length,breadth;
void area()
{
return length*breadth;
}
void perimeter()
{
return 2(length*breadth);
}
}
class Square extends Rectangle
{
int side;
void area()
{
return side*side;
}
void perimeter()
{
return 4*side;
}
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int length=s.nextInt();
int breadth=s.nextInt();
int side=s.nextInt();
Square s=new Square();
s.area();
s.perimeter();
}

