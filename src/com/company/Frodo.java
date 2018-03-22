package com.company;

/**
 * Created by avasiliev on 11.03.18.
 */
public class Frodo extends Hobbit {

  public static void main(String[] args){
    final int frodoGold=7;
    System.out.println(new Frodo().sumGold(frodoGold));
  }
}
class Hobbit{
  private final int hobbitGold = 6;

  public int getHobbitGold() {
    return hobbitGold;
  }

  int sumGold(int x, int ... y){
    int base = ((y.length>0)?y[0]:getHobbitGold());
    return x+base;
  }
}