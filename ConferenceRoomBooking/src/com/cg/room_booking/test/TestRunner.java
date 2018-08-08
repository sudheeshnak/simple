package com.cg.room_booking.test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"room_bookingFeaturefiles"},
		glue= {"com.cg.room_booking.stepdefinations"}
)
public class TestRunner {

}