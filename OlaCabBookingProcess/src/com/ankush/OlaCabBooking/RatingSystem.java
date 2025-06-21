package com.ankush.OlaCabBooking;

public class RatingSystem extends Thread
{
	@Override
	public void run()
	{
       System.out.println("Requesting user rating...");
       
       try
       {
    	   Thread.sleep(1000);
       }
       catch(InterruptedException e)
       {
    	   e.printStackTrace();
       }
       System.out.println("User rated the ride: 5 star");
	}

}
