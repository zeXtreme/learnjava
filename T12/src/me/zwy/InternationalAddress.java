package me.zwy;

public class InternationalAddress extends Address {

	public InternationalAddress(int zipCode, String country, String province,
			String city, String street) {
		super(zipCode, country, province, city, street);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "�ֵ���:" + getStreet() + "  ����:" + getCity() + "  ʡ:"
				+ getProvince() + "  ����:" + getCountry() + " ��������:"
				+ getZipCode();
	}

}
