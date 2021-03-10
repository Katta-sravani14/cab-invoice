package com.bridgelabz.invoiceuc5;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class InvoiceServiceTest {

	static InvoiceServiceTest invoiceService;
	static Ride[] rides;
	static InvoiceSummary expectedInvoiceSummary;

	@BeforeClass
	public static void createInvoiceGeneratorObj() {
		invoiceService = new InvoiceServiceTest();
		
		expectedInvoiceSummary = new InvoiceSummary(2, 45);
		System.out.println("Welcome to Cab Invoice Generator Program");
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

	private double calculateFare(double distance, int time) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides = {
					new Ride(2.0, 5),
					new Ride(0.1, 1)
				};
		InvoiceSummary actualInvoiceSummary = invoiceService.calculateSummaryFare(Arrays.asList(rides));
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
		Assert.assertEquals(expectedInvoiceSummary, actualInvoiceSummary);
	}

	public InvoiceSummary calculateSummaryFare(List<Ride> asList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void givenUserIdAndRide_ShouldReturnInvoiceSummary() {
		invoiceService.addRides("abc", new Ride[] { new Ride(2.0, 5), new Ride(0.1, 1)});
		invoiceService.addRides("def", new Ride[] { new Ride(5.0, 5), new Ride(0.1, 1)});
		InvoiceSummary actualInvoiceSummary = invoiceService.getInvoiceSummary("def");
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 60);
		invoiceService.addRides("def", new Ride[] { new Ride(5.0, 5), new Ride(0.1, 1)});
		invoiceService.addRides("abc", rides);
		InvoiceSummary actualInvoiceSummary1 = invoiceService.getInvoiceSummary("abc");
		expectedInvoiceSummary = new InvoiceSummary(2, 45);
		Assert.assertEquals(expectedInvoiceSummary, actualInvoiceSummary1);
	}
private void addRides(String string, Ride[] rides2) {
		// TODO Auto-generated method stub
		
	}

public InvoiceSummary getInvoiceSummary(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}