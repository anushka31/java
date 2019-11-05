class Sweet
{
int candy=5;
void moreCandy(Sweet s1)
{
s1.candy=10;
}

public static void main(String args[])
{
Sweet so=new Sweet();
so.moreCandy(so);
System.out.println(so.candy);
}
}
