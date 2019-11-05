class Car {

	Car() {

		System.out.println("constructor of base class");	      
	}

	Car(int speed) {

		System.out.println("car is running at"+speed+"miles/hr");
 	}

}
class Sedan extends Car {

	Sedan() {
		
		super(70);
		System.out.println("constructor of Sedan class");
	
	}
}
class Program {

	public static void main(String args[]) {

		Sedan s=new Sedan();

  	}
}



