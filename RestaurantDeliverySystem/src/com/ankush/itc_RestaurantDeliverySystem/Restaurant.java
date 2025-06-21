package com.ankush.itc_RestaurantDeliverySystem;

public class Restaurant 
{
	private String name;
	private String order;
	private boolean isOrderReady = false;
	
	public Restaurant(String name)
	{
		this.name = name; 
	}
	
	public synchronized void placeOrder(String order) 
	{
		this.order = order;
		
		System.out.println("Waiter: Placed order for "+ this.order);
		notify();
		
		while(!isOrderReady)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.println("Waiter: Serving  the "+this.order);
		
	
		
	}
	
	public synchronized void prepareOrder()
	{
		
		while(this.order == null)
		{
			try 
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				
				Thread.currentThread().interrupt();
			}
		}		
		
		System.out.println("Chef: Preparing "+this.order);
		try 
		{
			Thread.sleep(5000);	
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Chef: "+ this.order+" is ready!");
		isOrderReady = true;
		
		notify();
	}
	
	public String getRestaurantName()
	{
		return name;
	}	
}

