package com.company;

/**
 * Created by avasiliev on 11.03.18.
 */
public class TestDays {
  public enum Days {MON, TUE, WED };
  public static void main(String[] args){
    for (Days d: Days.values()){
      System.out.println(d);
    }
    Days[] d2 = Days.values();
    //System.out.println(d2.getClass().getName());
    System.out.println(d2[2]);
  }

}
