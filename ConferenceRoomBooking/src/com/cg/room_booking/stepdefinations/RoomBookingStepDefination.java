package com.cg.room_booking.stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.room_booking.beans.RoomBooking;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoomBookingStepDefination {

	private WebDriver driver;
	private RoomBooking roomBooking;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );
	}

	@Given("^User is on home page of registration for the room$")
	public void user_is_on_home_page_of_registration_for_the_room() throws Throwable {

		driver = new ChromeDriver();
		driver.get("D:\\Practice\\BDD\\ConferenceRoomBooking_153117\\ConferenceRegistartion.html");
		driver.manage().window().maximize();
		
		String expectedPageTitle="Conference Registartion";
		String actualPageTitle=driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		
		roomBooking = new RoomBooking();
		PageFactory.initElements(driver,roomBooking);

	}

	@When("^User clicks on next without entering 'First Name'$")
	public void user_clicks_on_next_without_entering_First_Name() throws Throwable {

		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please fill the First Name' should display$")
	public void alert_box_with_message_Please_fill_the_First_Name_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the First Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without entering 'Last Name'$")
	public void user_clicks_on_next_without_entering_Last_Name() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setFirstName("Sudheeshna");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please fill the Last Name' should display$")
	public void alert_box_with_message_Please_fill_the_Last_Name_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Last Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next with wrong format of 'Email'$")
	public void user_clicks_on_next_with_wrong_format_of_Email() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setLastName("Kotte");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please fill the Email' should display$")
	public void alert_box_with_message_Please_fill_the_Email_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Email";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without entering 'Contact No'$")
	public void user_clicks_on_next_without_entering_Contact_No() throws Throwable {
		driver.switchTo().alert().dismiss();
		roomBooking.setEmail("sudheeshnakotte@gmail.com");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please fill the Contact No\\.' should display$")
	public void alert_box_with_message_Please_fill_the_Contact_No_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Contact No.";
		Assert.assertEquals(expectedMessage, actualMessage);

	}

	@When("^User clicks on next with invalid 'Contact No'$")
	public void user_clicks_on_next_with_invalid_Contact_No() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setContactNo("6788034534");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please enter valid Contact no\\.' should display$")
	public void alert_box_with_message_Please_enter_the_valid_Contact_No_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please enter valid Contact no.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without entering 'Number of people attending'$")
	public void user_clicks_on_next_without_entering_Number_of_people_attending() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setContactNo("9855403321");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please fill the Number of people attending' should display$")
	public void alert_box_with_message_Number_of_people_attending_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Number of people attending";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without entering 'Building Name & Room No'$")
	public void user_clicks_on_next_without_entering_Building_Name_Room_No() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setNoPersons("1");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please fill the Building & Room No' should display$")
	public void alert_box_with_message_Please_fill_the_Buliding_Room_No_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Building & Room No";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without entering 'Area Name'$")
	public void user_clicks_on_next_without_entering_Area_Name() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setAddress("14and5");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please fill the Area name' should display$")
	public void alert_box_with_message_Please_fill_the_Area_name_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Area name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without entering 'city'$")
	public void user_clicks_on_next_without_entering_City() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setAreaName("CrystalPlaza");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please select city' should display$")
	public void alert_box_with_message_Please_select_City_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please select city";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without entering 'State'$")
	public void user_clicks_on_next_without_entering_State() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setCity("Pune");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please select state' should display$")
	public void alert_box_with_message_Please_select_State_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please select state";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on next without selecting the 'Membership Status'$")
	public void user_clicks_on_next_without_selecting_the_Membership_Status() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setState("Karnataka");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Please Select MemeberShip status' should display$")
	public void alert_box_with_message_Please_select_MemberShip_status_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please Select MemeberShip status";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on 'Next' after entering all valid details$")
	public void user_clicks_on_Next_after_entering_all_valid_details() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setMemberStatus("member");
		roomBooking.clickNext();
	}

	@Then("^alert box with message 'Personal details are validated.' should display$")
	public void alert_box_with_message_Personal_details_are_validated_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Personal details are validated.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@Then("^User should be navigated to the payment page$")
	public void user_should_be_navigated_to_the_payment_page() throws Throwable {

		driver.switchTo().alert().dismiss();
		String expectedPageTitle="Payment Details";
		String actualPageTitle=driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}

	@When("^User clicks on make payment without entering 'Card Holder Name'$")
	public void user_clicks_on_make_payment_without_entering_Card_Holder_Name() throws Throwable {

		roomBooking.clickMakePayment();
	}

	@Then("^alert box with message 'Please fill the Card holder name' should display$")
	public void alert_box_with_message_Please_fill_the_Card_holder_name_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Card holder name";
		Assert.assertEquals(expectedMessage, actualMessage);

	}

	@When("^User clicks on make payment without entering 'Debit Card Number'$")
	public void user_clicks_on_make_payment_without_entering_Debit_Card_Number() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setCardHolderName("Sudheeshna Kotte");
		roomBooking.clickMakePayment();
	}

	@Then("^alert box with message 'Please fill the Debit card Number' should display$")
	public void alert_box_with_message_Please_fill_the_Debit_card_Number_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the Debit card Number";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on make payment without entering 'CVV'$")
	public void user_clicks_on_make_payment_without_entering_CVV() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setDebitCardNo("334564756779");
		roomBooking.clickMakePayment();
	}

	@Then("^alert box with message 'Please fill the CVV' should display$")
	public void alert_box_with_message_Please_fill_the_CVV_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the CVV";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on make payment without entering 'Expiration month'$")
	public void user_clicks_on_make_payment_without_entering_Expiration_month() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setCVV("445");
		roomBooking.clickMakePayment();
	}

	@Then("^alert box with message 'Please fill expiration month' should display$")
	public void alert_box_with_message_Please_fill_the_expiration_month_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill expiration month";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on make payment without entering 'Expiration Year'$")
	public void user_clicks_on_make_payment_without_entering_Expiration_Year() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setExpirationMonth("10");
		roomBooking.clickMakePayment();
	}

	@Then("^alert box with message 'Please fill the expiration year' should display$")
	public void alert_box_with_message_Please_fill_the_expiration_Year_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Please fill the expiration year";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User clicks on 'Make Payment' after entering all valid details$")
	public void user_clicks_on_Make_Payment_after_entering_all_valid_details() throws Throwable {

		driver.switchTo().alert().dismiss();
		roomBooking.setExpirationYear("2020");
		roomBooking.clickMakePayment();
	}

	@Then("^alert box with message 'Conference Room Booking successfully done!!!' should display$")
	public void alert_box_with_message_Conference_Room_Booking_successfully_done_should_display() throws Throwable {

		String actualMessage = driver.switchTo().alert().getText();
		String expectedMessage ="Conference Room Booking successfully done!!!";
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.close();
	}

}
