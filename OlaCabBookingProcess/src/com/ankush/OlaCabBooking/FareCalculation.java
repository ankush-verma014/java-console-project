package com.ankush.OlaCabBooking;

public class FareCalculation extends Thread
{
  @Override
  public void run()
  { 
	  System.out.println("Calculating estimated fare...");

	  try
	  {
		  Thread.sleep(1500);
	  }
	  catch(InterruptedException e)
	  {
		  e.printStackTrace();
	  }
	  System.out.println("Estimated fare: 135.75 RS.");
  }
}
