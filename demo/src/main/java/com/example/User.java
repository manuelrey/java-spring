package com.example;

public class User {
	
	private String id;
	private String name;
	private int age;
	
	public User(String id, String name, int age){
		this.id = id;
		this.age = age;
		this.name = name;		
	}
	 public String getId(){
		 return id;
	 }
	 public int getAge(){
		 return age;
	 }
	 public String getName(){
		 return name;
	 }
	 public void setId(String id){
		 this.id = id;
	 }
	 public void setAge(int age){
		 this.age = age;
	 }
	 public void setName(String name){
		 this.name = name;
	 }
	 	 
}
