	class Furniture{
			
	int height,width;

	void display(){

	System.out.println("height is"+height);
	System.out.println("width is" +width);
	}
}
	class Chair extends Furniture
	{
	Chair(int h,int w){

	height=h;
width=w;
	
}


public static void main(String args[])
{
Chair c=new Chair(10,20);
c.display();
}
}


