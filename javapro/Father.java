class Father
{
void foodHabit()
{
System.out.println("hi i like salty");
}
class Son extends Father
{
void foodHabit()
{
System.out.println("i like sweet");
}

public static void main(String args[])
{
Son aman=new Son();
aman.foodHabit();
}
}

