package com.ankush.OlaCabBooking;

public class PaymentProcessing extends Thread
{ 
	@Override
	public void run()
	{
		System.out.println("Processing payment...");

		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Payment successful!");
	}
  
}
