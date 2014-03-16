package me.zwy;

public class InternationalAddress extends Address {

	public InternationalAddress(int zipCode, String country, String province,
			String city, String street) {
		super(zipCode, country, province, city, street);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "街道名:" + getStreet() + "  城市:" + getCity() + "  省:"
				+ getProvince() + "  国家:" + getCountry() + " 邮政编码:"
				+ getZipCode();
	}

}
