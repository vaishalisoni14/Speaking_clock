package com.example.myproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.example.myproject.service.TimeServiceClock;

import com.example.myproject.exception.*;

class MyprojectApplicationTests {

	private final TimeServiceClock timeService = new TimeServiceClock();

	@Test
	void testConvertTimeToWords_Midday() {
		try {
			String result = timeService.convertTimeToWords("12:00");
			assertEquals("It's Midday", result);
		} catch (Exception e) {
			fail("Unexpected exception thrown: " + e.getMessage());
		}
	}

	@Test
	void testConvertTimeToWords_Midnight() {
		try {
			String result = timeService.convertTimeToWords("00:00");
			assertEquals("It's Midnight", result);
		} catch (Exception e) {
			fail("Unexpected exception thrown: " + e.getMessage());
		}
	}

	@Test
	void testConvertTimeToWords_OtherTime() {
		try {
			String result = timeService.convertTimeToWords("14:30");
			assertEquals("It's fourteen thirty", result);
		} catch (Exception e) {
			fail("Unexpected exception thrown: " + e.getMessage());
		}
	}

	@Test
	public void testConvertTimeToWords_InvalidTime() {
		try {
			timeService.convertTimeToWords("25:00");
			fail("Expected an InvalidTimeFormatException to be thrown");
		} catch (InvalidTimeFormatException e) {
			assertEquals("Invalid time format", e.getMessage());
		} catch (Exception e) {
			fail("Unexpected exception thrown: " + e.getMessage());
		}
	}

}
