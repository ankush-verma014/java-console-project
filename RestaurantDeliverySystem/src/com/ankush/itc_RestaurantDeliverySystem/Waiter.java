package com.ankush.itc_RestaurantDeliverySystem;

public class Waiter extends Thread
{
	private Restaurant restaurant;
	private String orderName;
	
	public Waiter(Restaurant restaurant)
	{
		this.restaurant = restaurant;
		
	}
	
	public void acceptOrder(String orderName)
	{
		this.orderName = orderName;
	}
	
	@Override
	public void run()
	{
		restaurant.placeOrder(orderName);
	}
}

