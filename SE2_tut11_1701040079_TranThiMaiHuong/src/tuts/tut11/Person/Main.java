/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuts.tut11.Person;

import java.util.Scanner;
import tuts.tut11.Person.Person;
import tuts.tut11.Person.Child;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Your name?");
    String name = scanner.nextLine();
     System.out.println("Your age?");
 int age = Integer.valueOf(scanner.nextLine());
 try {
 Child child = new Child(name, age);
 System.out.println(child.toString());
 String personClassName = Person.class.getSimpleName();
 String childClassName = Child.class.getSimpleName();
 } catch (IllegalArgumentException error) {
 System.out.println(error.getMessage());
 }    
}
}
