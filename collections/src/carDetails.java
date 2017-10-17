
public class carDetails {
	private String RegistrationNUmber;
	private int price;
	public String getRegistrationNUmber() {
		return RegistrationNUmber;
	}
	public void setRegistrationNUmber(String registrationNUmber) {
		RegistrationNUmber = registrationNUmber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public carDetails(String registrationNUmber, int price) {
		super();
		RegistrationNUmber = registrationNUmber;
		this.price = price;
	}

}
