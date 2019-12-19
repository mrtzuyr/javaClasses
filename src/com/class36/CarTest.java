package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car {
	
	String make,model;
	
	public Car(String make, String model) {
		this.make=make;
		this.model=model;
	}
	
	public void display() {
		System.out.println(make+" "+model);
	}	
}

public class CarTest{
	public static void main(String[] args) {
		
		Map<Integer, Car>cars=new LinkedHashMap<>();
		cars.put(1,new Car("BMW","X5"));
		cars.put(2,new Car("Tesla","S"));
		cars.put(3,new Car("Honda","Insight"));
		cars.put(4,new Car("Nissan","Altima"));
		cars.put(5,new Car("Toyota","FJ Cruiser"));
		cars.put(1,new Car("Hyundai","Elentra"));
		
		System.out.println(cars.size());
		
		//display only values
		System.out.println("------display only values with collection");
		Collection<Car>coll=cars.values();
		for(Car c:coll){
			//System.out.println(c.make);
			c.display();
		}
		
		System.out.println("-------entrySet--------");//using entrySet
		Set<Entry<Integer, Car>>carList=cars.entrySet();
		
		for(Entry<Integer, Car> ent:carList) {
			Integer i=ent.getKey();
			Car c=ent.getValue();
			//c.display();
			System.out.println("Car "+i+" is "+c.make+" "+c.model);
		}
		
		System.out.println("-------keySet---------");//using keySet
		Set<Integer>kSet=cars.keySet();
		for(Integer key:kSet) {
			//System.out.println(key+" "+cars.get(key).make+" "+cars.get(key).model);
			Car car=cars.get(key);
			String carDetails=car.make+" "+car.model;
			System.out.println(carDetails);
		}
		
		System.out.println("--------iterator--------");//using iterator
		
		Iterator<Integer>it=kSet.iterator();
		while(it.hasNext()) {
			Car c=cars.get(it.next());
			System.out.println(c.make+" "+c.model);
			
		}
	}
}
