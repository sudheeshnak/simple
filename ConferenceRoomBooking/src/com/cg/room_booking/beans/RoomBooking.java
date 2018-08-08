package com.cg.room_booking.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomBooking {

	@FindBy(id="txtFirstName")
	WebElement FirstName;
	
	@FindBy(id="txtLastName")
	WebElement LastName;
	
	@FindBy(id="txtEmail")
	WebElement Email;
	
	@FindBy(id="txtPhone")
	WebElement ContactNo;
	
	@FindBy(name="size")
	WebElement NoPersons;
	
	@FindBy(id="txtAddress1")
	WebElement Address;
	
	@FindBy(id="txtAddress2")
	WebElement AreaName;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name ="state")
	WebElement State;
	
	@FindBy(name ="memberStatus")
	List<WebElement> MemberShipStatus;
	
	@FindBy(linkText="Next")
	WebElement Next;
	
	@FindBy(id = "txtCardholderName")
	WebElement CardHolderName;
	
	@FindBy(id = "txtDebit")
	WebElement DebitCardNo;
	
	@FindBy(id = "txtCvv")
	WebElement CVV;
	
	@FindBy(id = "txtMonth")
	WebElement ExpirationMonth;
	
	@FindBy(id = "txtYear")
	WebElement ExpirationYear;
	
	@FindBy(id = "btnPayment")
	WebElement MakePayment;

	public String getFirstName() {
		return this.FirstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.FirstName.sendKeys(firstName);
	}

	public String getLastName() {
		return this.LastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.LastName.sendKeys(lastName);
	}

	public String getEmail() {
		return this.Email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.Email.sendKeys(email);
	}

	public String getContactNo() {
		return this.ContactNo.getAttribute("value");
	}

	public void setContactNo(String contactNo) {
		this.ContactNo.clear();
		this.ContactNo.sendKeys(contactNo);
	}

	public String getNoPersons() {
		return this.NoPersons.getAttribute("value");
	}

	public void setNoPersons(String noPersons) {
		this.NoPersons.sendKeys(noPersons);
	}

	public String getAddress() {
		return this.Address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.Address.sendKeys(address);
	}

	public String getAreaName() {
		return this.AreaName.getAttribute("value");
	}

	public void setAreaName(String areaName) {
		this.AreaName.sendKeys(areaName);
	}

	public String getCity() {
		return this.City.getAttribute("value");
	}

	public void setCity(String city) {
		this.City.sendKeys(city);
	}

	public String getState() {
		return this.State.getAttribute("value");
	}

	public void setState(String state) {
		this.State.sendKeys(state);
	}
	
	public void setMemberStatus(String memberStatus) {
		for(WebElement radio: MemberShipStatus) {
			if(radio.getAttribute("value").contains(memberStatus))
				radio.click();
		}
	}
	public void clickNext() {
		Next.click();
	}

	public String getCardHolderName() {
		return this.CardHolderName.getAttribute("value");
	}

	public void setCardHolderName(String cardHolderName) {
		this.CardHolderName.sendKeys(cardHolderName);
	}

	public String getDebitCardNo() {
		return this.DebitCardNo.getAttribute("value");
	}

	public void setDebitCardNo(String debitCardNo) {
		this.DebitCardNo.sendKeys(debitCardNo);
	}

	public String getCVV() {
		return this.CVV.getAttribute("value");
	}

	public void setCVV(String cVV) {
		this.CVV.sendKeys(cVV);
	}

	public String getExpirationMonth() {
		return this.ExpirationMonth.getAttribute("value");
	}

	public void setExpirationMonth(String expirationMonth) {
		this.ExpirationMonth.sendKeys(expirationMonth);
	}

	public String getExpirationYear() {
		return this.ExpirationYear.getAttribute("value");
	}

	public void setExpirationYear(String expirationYear) {
		this.ExpirationYear.sendKeys(expirationYear);
	}

	public void clickMakePayment() {
		MakePayment.click();
	}
	
}
