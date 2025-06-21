package com.ankush.itc_RestaurantDeliverySystem;

public class RestaurantSystem 
{
	public static void main(String [] args)
	{
		Restaurant rest = new Restaurant("KFC");
		
		System.out.println("Welcome to "+rest.getRestaurantName()+" Restaurant!!!");
		
		Waiter wait = new Waiter(rest);
		wait.acceptOrder("Fried Chicken");
		wait.start();
		
		Chef che = new Chef(rest);
		che.start();	
	}
}

