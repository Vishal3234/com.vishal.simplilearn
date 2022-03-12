package com.vishal.project;
import java.util.*;  
public class Linkedlist {  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
al.add("Simlilearn");  
al.add("Vishal");  
al.add("Sree");  
al.add("king");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  