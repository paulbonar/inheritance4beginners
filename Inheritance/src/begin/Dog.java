package begin;

import javax.print.attribute.standard.Sides;

public class Dog extends Pet {

	private boolean isGuardDog;

	boolean isGuardDog() {
		return isGuardDog;
	}

	void setGuardDog(boolean isGuardDog) {
		this.isGuardDog = isGuardDog;
	}

	/**
	 * 
	 */
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petID
	 * @param name
	 * @param dob
	 * @param licenceReg
	 * @param purchasePrice
	 */
	public Dog(int petID, String name, String dob, boolean licenceReg, double purchasePrice) {
		super(petID, name, dob, licenceReg, purchasePrice);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petID
	 * @param name
	 * @param ownerFName
	 * @param ownerLName
	 * @param eircode
	 * @param dob
	 * @param licenceReg
	 * @param sellingPrice
	 * @param purchasePrice
	 */
	public Dog(int petID, String name, String ownerFName, String ownerLName, String eircode, String dob,
			boolean licenceReg, double sellingPrice, double purchasePrice, boolean isGuardDog) {
		super(petID, name, ownerFName, ownerLName, eircode, dob, licenceReg, sellingPrice, purchasePrice);
		// TODO Auto-generated constructor stub
	
		this.isGuardDog = isGuardDog;
	
	}

	public Dog(int i, String string, String string2, boolean b, double d, boolean c) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String myString = super.toString() + "Dog [isGuardDog=" + isGuardDog + "]";
		return myString;
	}
	

	//@Override
	//public String toString() {
		//String myString = super.toString();
		
		//return String.format("%s,%s,%s,%s", this.getPetID(), this.getName(), this.getOwnerLName(), this.isGuardDog());
}