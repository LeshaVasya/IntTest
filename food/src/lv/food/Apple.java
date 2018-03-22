package lv.food;

/**
 * Created by avasiliev on 09.03.18.
 */



public class Apple extends Fruit {
   public Integer getJuice (Integer fruit){
     return fruit-1;
   }

   public Apple (Integer fruit, String fruitName){
     this.setFruit(fruit);
     this.setFruitName(fruitName);
   }
}
