package com.amkush.Car_parking;

public class CarparkingSystem 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		// This is the first way
		
	/*	System.out.println("Welcome to D-Mart Parking");
		ParkingGarage pg = new ParkingGarage(3);
		System.out.println("Total Available spots are:" + pg.getAvailableSpots());
		Car c1 = new Car(pg, "Maruti Brezza");
		Car c2 = new Car(pg, "Tata Naxon");
		Car c3 = new Car(pg, "Mahindra BE6");
		Car c4 = new Car(pg, "Kia Seltos");
		Car c5 = new Car(pg, "Honda city");
		Car c6 = new Car(pg, "Toyota Fortuner");
		Car c7 = new Car(pg, "Hundai i20");
		
		Thread t = new Thread(c1);
		Thread t1 = new Thread(c2);
		Thread t2 = new Thread(c3);
		Thread t3 = new Thread(c4);
		Thread t4 = new Thread(c5);
		Thread t5 = new Thread(c6);
		Thread t6 = new Thread(c7);		
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		*/
		
		// This is the second way
		System.out.println("Welcome to D-Mart Parking");
		int maxSpots=5;
		ParkingGarage pg = new ParkingGarage(maxSpots);
		System.out.println("Total Available spots are:" + pg.getAvailableSpots());
        String[] carNames = {"Maruti Brezza", "Tata Naxon", "Mahindra BE6","Kia Seltos", "Honda city", "Toyota Fortuner", "Hundai i20"};
        
        Thread[] t1 = new Thread[carNames.length];
        
        for(int i=0;i<carNames.length;i++)
        {
        	t1[i]= new Thread(new Car(pg, carNames[i]));
        	t1[i].start();
        }
        
        System.out.println("Parking garage simulation is complete.");
	}
}

