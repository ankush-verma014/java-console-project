package com.amkush.Car_parking;

import java.util.Random;

public class Car implements Runnable
{
	private ParkingGarage garage;
	private String carName;

	public Car(ParkingGarage garage, String carName)
	{
		super();
		this.garage = garage;
		this.carName = carName;
	}

	@Override
	public void run() 
	{
		try 
		{
			garage.parkCar(carName);
			Thread.sleep(new Random().nextLong(1000)+2000);
			garage.freeSpot(carName);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
			Thread.interrupted();
		}
//		if(garage.getAvailableSpots()>0) {
//			System.out.println("Sucessfull parked All Vehicle...");
//			System.exit(0);
//		}
	}
}

