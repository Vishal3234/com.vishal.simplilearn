package com.vishal.constructors;

public class Empinfo {
		  private String name;

		  // constructor
		  Empinfo() {
		    System.out.println("Constructor Called:");
		    name = "Programiz";
		  }

		  public static void main(String[] args) {

		    // constructor is invoked while
		    // creating an object of the Main class
		    Empinfo obj = new Empinfo();
		    System.out.println("The name is " + obj.name);
		  }
		}

