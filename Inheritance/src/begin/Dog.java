package begin;

public class Dog extends Pet {

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
			boolean licenceReg, double sellingPrice, double purchasePrice) {
		super(petID, name, ownerFName, ownerLName, eircode, dob, licenceReg, sellingPrice, purchasePrice);
		// TODO Auto-generated constructor stub
	}

	
}
