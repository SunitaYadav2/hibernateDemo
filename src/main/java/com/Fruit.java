package com;
import javax.persistence.*;


@Entity  // table name
public class Fruit {
	String name;
	int price;
	String colour;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, int price, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
@Id  //primary key
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + ", colour=" + colour + "]";
	}
	
	
	
	

}
