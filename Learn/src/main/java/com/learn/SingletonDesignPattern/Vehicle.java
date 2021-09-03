package com.learn.SingletonDesignPattern;

public class Vehicle {

	private int vehicleID;
	private String name;
	
	/*
	 * the volatile variable will always be read from the main memory, not from the
	 * local thread cache. If you declared variable as volatile, Read and Writes are
	 * atomic
	 */
	private static volatile Vehicle vehicle;

	private Vehicle(int vehicleID, String name) {
		super();
		this.vehicleID = vehicleID;
		this.name = name;
	}

	public static Vehicle getInstance() {

		if (vehicle == null) {
			synchronized (Vehicle.class) {
				if (vehicle == null) {
					vehicle = new Vehicle(101, "BUS");
				}
			}

		}

		return null;

	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleID + ", name=" + name + "]";
	}

}
