package com.ankush.OlaCabBooking;

public class DriverAssignment extends Thread
{
	@Override
	  public void run()
	  {
		
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Driver found and assigned!");
	  }
}
