package com.digitek.exercise1;

public class Person1 {
    String name="Girinandini";
    
	public static void main(String[] args) {
        Person1 p1= new Person1();
		String temp = p1.getName();
		String fullname= temp.concat(" "+"Koneru");
		p1.setName(fullname);
		p1.writeName();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void writeName(){
		System.out.println("My Name is:"+" "+ name);
	}
}
