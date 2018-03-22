package com.company;

/**
 * Created by avasiliev on 11.03.18.
 */
public class Electronic implements Device{
  public void doIt(){

  }
  public  static void main(String[] args){
    System.out.println("Yes");
  }
}

abstract class  Phone1 extends Electronic{

}

abstract class  Phone2 extends Electronic{
  public void doIt(int x){

  }
}

class Phone3 extends Electronic implements Device{
  public void doStuff(){

  }
}

interface Device{
    public void doIt();
}