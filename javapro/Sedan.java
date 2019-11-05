class Car{
	Car()
	{
	System.out.println("constructor of base class");	      }
	}
}
class Sedan extends Car{

	Sedan(){
	
	System.out.println("constructor of Sedan class");
	}
}
class Program{
	public static void main(String args[]){

	Sedan s=new Sedan();

  	}
}



