package com.ankush.OlaCabBooking;

public class LiveTracking extends Thread
{
	private int locationPercentage;
	
	public LiveTracking()
	{
		this.locationPercentage=0;
	}
	
  @Override
  public void run()
  {
	  while(locationPercentage<100)
	  {
		  locationPercentage = locationPercentage + 20;
		  System.out.println("Updating ride location..."+ locationPercentage +"completed");
		  
		  try
		  {
			  Thread.sleep(500);
		  }
		  catch (InterruptedException e) 
		  {
		    e.printStackTrace();
		  }
	  }
	  
	  System.out.println("Ride Completed");  
  }
}
