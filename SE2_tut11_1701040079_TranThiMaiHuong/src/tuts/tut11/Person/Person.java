/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuts.tut11.Person;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Person {
 // 1. Add the Fields
    private int age;
    private String name;
 // 2. Add the Constructor
    public Person(String name, int age){
 
        this.setName(name);
 this.setAge(age);
} 
 // 3. Add the Properties

 // 4. Add the Methods

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) throws IllegalArgumentException {
  if (age<1){
  throw new IllegalArgumentException("age can not be negative");
  
  }//else
  
        this.age = age;
    }

    public void setName (String name) throws IllegalArgumentException {
        if (name.length() <3) throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
   
    
    this.name = name;
    
}

    /**
     * @return the name
     */
 
    @Override
public String toString() {
 final StringBuilder sb = new StringBuilder();
 sb.append(String.format("Name: %s, Age: %d",
 this.getName(),
this.getAge()));
 return sb.toString();
} 
    
}