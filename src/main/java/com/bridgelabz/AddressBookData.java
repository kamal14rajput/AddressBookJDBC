package com.bridgelabz;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class AddressBookData {
	public String firstname, lastname;
	public String address, city, state;
	public BigDecimal zip;
	public BigDecimal phoneNumber;
	public String email;

	public AddressBookData(String firstname, String lastname, String address, String city, String state,
			BigDecimal zip2, BigDecimal phoneNo, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip2;
		this.phoneNumber = phoneNo;
		this.email = email;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getZip() {
		return zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

	public BigDecimal getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNo(BigDecimal phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method use to print all the value.
	 */
	@Override
	public String toString() {
		return " First Name:" + firstname + " Last Name:" + lastname + " Address:" + address + " City:" + city
				+ " State:" + state + " Zip:" + zip + " PhoneNumber:" + phoneNumber + " EmailId:" + email + '\n';
	}
}
