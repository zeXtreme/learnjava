package me.zwy;

public class Address {

	public Address(int zipCode, String country, String province, String city,
			String street) {
		this.zipCode = zipCode;
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
	}

	private int zipCode;

	private String country;

	private String province;

	private String city;

	private String street;

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String toString() {
		return "邮政编码:" + zipCode + "  国家:" + country + "   省:" + province
				+ "   城市:" + city + "   街道名" + street;
	}

}
