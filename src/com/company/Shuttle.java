package com.company;

/**
 * Created by avasiliev on 11.03.18.
 */

class Rocket{
  private void takeOff(){
    System.out.println("Success");
  }
}
public class Shuttle extends  Rocket{
  public static void main(String[] args){
    new Shuttle().go();
  }
  void go(){
    takeOff();
  }
  private void takeOff(){
    System.out.println("Victory");
  }
}
