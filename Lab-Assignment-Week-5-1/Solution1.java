// import java.io.*;
import java.util.*;

class Animal{
	private String name;
  
    Animal(String name){
    	this.name = name;
    }

   protected String getName(){
        return this.name;
    }
}

class Dog extends Animal{
	private String owner;
  
    Dog(String owner, String dogName){
        // Complete the constructor to initialize a Dog object
        super(dogName);
        this.owner = owner;
    }
  
    public String getOwnerName(){
        return this.owner;
    }
  
    public void print(){
    	/* 
        	implement the print method to print the name of the owner followed
        	by the name of the dog in the required format
        */
        System.out.println("Hello I am " + this.owner + " and this is my dog - " + getName() +"!");
    }
}

/*
	Do not modify any code below this line!
*/

class Solution1{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.parseInt(sc.nextLine());
     
            for(int i = 0; i < n; i++){
            	String owner = sc.nextLine();
                String dog = sc.nextLine();
              	
                Dog d = new Dog(owner, dog);
                d.print();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}