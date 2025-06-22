package com.ankush.OlaCabBooking;

public class OlaRidingApp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		RideRequest ride = new RideRequest();
		DriverAssignment driver = new DriverAssignment();
		FareCalculation fare = new FareCalculation();
		LiveTracking live = new LiveTracking();
		PaymentProcessing payment = new PaymentProcessing();
		RatingSystem rating = new RatingSystem();
		
		ride.start();
		fare.start();
		ride.join();
		live.start();
		live.join();
		payment.start();
		payment.join();
		rating.start();

	}

}
