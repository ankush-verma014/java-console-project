package com.amkush.Car_parking;

public class ParkingGarage 
{
	private int availableSpots;
	private final int MAX_SPOTS;

	public ParkingGarage(int maxSpots) 
	{
		this.MAX_SPOTS = maxSpots;
		this.availableSpots = maxSpots;
	}

	public synchronized void parkCar(String carName) 
	{
		while(availableSpots == 0) {
			try 
			{
				System.out.println(carName + " is waiting for a spot.");
				wait();
			} 
			catch (InterruptedException e) 
			{

				e.printStackTrace();
				Thread.interrupted();
			}

		}
          availableSpots--;
		System.out.println(carName + " parked. Available spots: " +availableSpots);
		notifyAll();
	}

	public synchronized void freeSpot(String carName)
	{
		 
		while (availableSpots == MAX_SPOTS) 
		{
			try 
			{
				System.err.println("No car is waiting for parking");
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				Thread.interrupted();
			}
		}
		availableSpots++;
			System.out.println(carName + " left. " + "Available Spots :" + availableSpots);
		
		notify();
	}

	public int getAvailableSpots()
	{
		return availableSpots;
	}

}

