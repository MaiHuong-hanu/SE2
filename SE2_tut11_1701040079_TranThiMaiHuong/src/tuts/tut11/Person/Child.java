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
public class Child extends Person {
private int height;
    public Child (String n, int a){    
super(n, a);
  
}
  
@Override
public void setAge(int age) throws  IllegalArgumentException {
 //TODO: Validate the age
 if (age>15) throw new IllegalArgumentException(
 "Child's age must be less than 15");
 //else
 super.setAge(age);
} 

    public int getHeight() {
        return height;
    }

    @Override
public String toString() {
 final StringBuilder sb = new StringBuilder();
 sb.append(String.format("Name: %s, Age: %d",
 this.getName(),
this.getAge()));
 return sb.toString();

}
}
