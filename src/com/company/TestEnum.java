package com.company;

/**
 * Created by avasiliev on 11.03.18.
 */

enum Animals{
  DOG("woof"), CAT("meow"), FISH("burble");
  String sound;
  Animals(String s){
    sound = s;
  }
}
class TestEnum {
  static Animals a;
  public  static void main(String[] args){
    System.out.println(a.DOG.sound + " " + a.FISH.sound);
  }
}
