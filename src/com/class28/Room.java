package com.class28;

public class Room extends Building {
	
	int roomNumber;
	
	Room(String address, int floor, int roomNumber){
		super(address, floor);
		this.roomNumber=roomNumber;
		}
	
	public void display() {
		System.out.println(address+" "+floor+" "+roomNumber);
	}
	
	public static void main(String[] args) {
		Room room=new Room("124 Test Road",10,101);
		
		room.display();
	}

}
