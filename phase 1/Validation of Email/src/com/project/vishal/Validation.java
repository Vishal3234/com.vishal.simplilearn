package com.project.vishal;
import java.util.*;
import java.util.regex.*;
public class Validation {
public static void main(String[] args) {

List<String> emails = new ArrayList<String>();
// valid email addresses emails.add("kanesh@.com"); emails.add("vicky.vick@example.com"); emails.add("manoj@example.me.org");
//invalid email addresses emails.add("king.example.com"); emails.add("bavan..pob@example.com"); emails.add("krinu@.example.com");

for (String value : emails)
{
System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

}
System.out.println("Enter any email address to check"); 
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


}

public static boolean isValidEmail(String email) { String regex = "^(.+)@(.+)$";
//initialize the Pattern object
Pattern pattern = Pattern.compile(regex); Matcher matcher = pattern.matcher(email); return matcher.matches();


}

}
