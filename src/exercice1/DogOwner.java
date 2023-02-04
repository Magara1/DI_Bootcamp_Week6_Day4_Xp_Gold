package exercice1;


public class DogOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		
		dog.setDrinkTime(3);

	    System.out.println("Doit-on sortir le chien ? " + dog.needsToGo());
	    
	    dog.setDrinkTime(5);

	    System.out.println("Doit-on sortir le chien ? " + dog.needsToGo());
	
	}

}
