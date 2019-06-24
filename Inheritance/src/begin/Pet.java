package begin;

public class Pet {

	private int petID;
	private String name;
	private String ownerFName;
	private String ownerLName;
	private String eircode;
	private String dob;
	private boolean licenceReg;
	private double sellingPrice;
	private double purchasePrice;
	
	/**
	 * @param petID
	 * @param name
	 * @param dob
	 * @param licenceReg
	 * @param purchasePrice
	 */
	public Pet(int petID, String name, String dob, boolean licenceReg, double purchasePrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.dob = dob;
		this.licenceReg = licenceReg;
		this.purchasePrice = purchasePrice;
	}
	int getPetID() {
		return petID;
	}
	void setPetID(int petID) {
		this.petID = petID;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getOwnerFName() {
		return ownerFName;
	}
	void setOwnerFName(String ownerFName) {
		this.ownerFName = ownerFName;
	}
	String getOwnerLName() {
		return ownerLName;
	}
	void setOwnerLName(String ownerLName) {
		this.ownerLName = ownerLName;
	}
	String getEircode() {
		return eircode;
	}
	void setEircode(String eircode) {
		this.eircode = eircode;
	}
	String getDob() {
		return dob;
	}
	void setDob(String dob) {
		this.dob = dob;
	}
	boolean isLicenceReg() {
		return licenceReg;
	}
	void setLicenceReg(boolean licenceReg) {
		this.licenceReg = licenceReg;
	}
	double getSellingPrice() {
		return sellingPrice;
	}
	void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	double getPurchasePrice() {
		return purchasePrice;
	}
	void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
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
	public Pet(int petID, String name, String ownerFName, String ownerLName, String eircode, String dob,
			boolean licenceReg, double sellingPrice, double purchasePrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.ownerFName = ownerFName;
		this.ownerLName = ownerLName;
		this.eircode = eircode;
		this.dob = dob;
		this.licenceReg = licenceReg;
		this.sellingPrice = sellingPrice;
		this.purchasePrice = purchasePrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((eircode == null) ? 0 : eircode.hashCode());
		result = prime * result + (licenceReg ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ownerFName == null) ? 0 : ownerFName.hashCode());
		result = prime * result + ((ownerLName == null) ? 0 : ownerLName.hashCode());
		result = prime * result + petID;
		long temp;
		temp = Double.doubleToLongBits(purchasePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sellingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (eircode == null) {
			if (other.eircode != null)
				return false;
		} else if (!eircode.equals(other.eircode))
			return false;
		if (licenceReg != other.licenceReg)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ownerFName == null) {
			if (other.ownerFName != null)
				return false;
		} else if (!ownerFName.equals(other.ownerFName))
			return false;
		if (ownerLName == null) {
			if (other.ownerLName != null)
				return false;
		} else if (!ownerLName.equals(other.ownerLName))
			return false;
		if (petID != other.petID)
			return false;
		if (Double.doubleToLongBits(purchasePrice) != Double.doubleToLongBits(other.purchasePrice))
			return false;
		if (Double.doubleToLongBits(sellingPrice) != Double.doubleToLongBits(other.sellingPrice))
			return false;
		return true;
	}
	//empty constructor
	/**
	 * 
	 */
	public Pet() {
		super();
	}
	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", name=" + name + ", ownerFName=" + ownerFName + ", ownerLName=" + ownerLName
				+ ", eircode=" + eircode + ", dob=" + dob + ", licenceReg=" + licenceReg + ", sellingPrice="
				+ sellingPrice + ", purchasePrice=" + purchasePrice + "]";
	}

	String feedingInstructions() {
		return "Feed me or I will bite you"; }
	
	{
	}
}