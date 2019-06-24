package begin;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pet myPet = new Pet(1, "Thing", "21/06/2019", false, 200);
		
		Dog myDog = new Dog(2, "Idiot", "21/06/2019", false, 300);
		
		System.out.println(myDog.toString());
		System.out.println(myPet.toString());
		System.out.println(myDog.feedingInstructions());
	}

}