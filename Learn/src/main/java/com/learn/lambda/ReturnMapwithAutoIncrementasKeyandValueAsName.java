package com.learn.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Car{
	int carId;
	String name;
	
	public Car(int carId, String name) {
		super();
		this.carId = carId;
		this.name = name;
	}
	
	
	public int getCarId() {
		return carId;
	}
	
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class ReturnMapwithAutoIncrementasKeyandValueAsName {

	public static void main(String[] args) {
		
		List<Car>list=Arrays.asList(new Car(101,"Mercedes"),
									new Car(106,"Audi"),
									new Car(109,"Honda"),
									new Car(107,"Maruti"));
		
		
		AtomicInteger ai= new AtomicInteger(0);
		
		//The below example return the map with AutoIncrement vale as key 
		Map<Integer,String>map=list.stream().collect(Collectors.toMap(jj->ai.getAndIncrement(), Car::getName));
		
		map.forEach((k,v)-> System.out.println(k +" : "+v));
	}

}
