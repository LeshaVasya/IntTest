package com.company;

/**
 * Created by avasiliev on 29.04.18.
 */

class Vehicle{
  public static void  kmToMiles(int km){
    System.out.println("Внутри родительского класса/статического метода");
  } }

class Car extends Vehicle{
  public static void  kmToMiles(int km){
    System.out.println("Внутри дочернего класса/статического метода ");
  } }

public class StaticDemo{
  public static void main(String args[]){
    Vehicle v = new Car();
    v.kmToMiles(10);
    Vehicle.kmToMiles(10);
    Car.kmToMiles(10);
  }}
