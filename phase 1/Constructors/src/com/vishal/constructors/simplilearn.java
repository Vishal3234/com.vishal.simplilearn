package com.vishal.constructors;

public class simplilearn {

		  String language;

		  // constructor with no parameter
		  simplilearn() {
		    this.language = "Simplilearn";
		  }

		  // constructor with a single parameter
		  simplilearn(String language) {
		    this.language = language;
		  }

		  public void getName() {
		    System.out.println("Programming Langauage: " + this.language);
		  }

		  public static void main(String[] args) {

		    // call constructor with no parameter
			  simplilearn obj1 = new simplilearn();

		    // call constructor with a single parameter
			  simplilearn obj2 = new simplilearn ("Java");

		    obj1.getName();
		    obj2.getName();
		  }
		}


