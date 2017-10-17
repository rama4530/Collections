package DemoONSets;

import demoOnCollections.person;

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
	public carDetails(String registrationNUmber) {
		this.RegistrationNUmber = registrationNUmber;
		this.price = price;
	}
	public String toString(){
		return RegistrationNUmber;
	}
	public boolean equals(Object obj){
		if(obj!=null && obj instanceof carDetails){
			String regNUmb=((carDetails)obj).getRegistrationNUmber();
			if(regNUmb!=null & regNUmb.equals(RegistrationNUmber)){
				return true;
			}
		}
		return false;
	}
}
