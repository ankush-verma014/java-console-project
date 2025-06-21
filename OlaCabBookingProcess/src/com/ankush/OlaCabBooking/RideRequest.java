package com.ankush.OlaCabBooking;

public class RideRequest extends Thread
{
  @Override
  public void run()
  {
	  System.out.println("User requested a ride...");
	  
    try 
	{
		Thread.sleep(2000);
	}
	 catch (InterruptedException e) 
	 {
		e.printStackTrace();
	 }
    System.out.println("Searching for nearby drivers...");
  }
}
