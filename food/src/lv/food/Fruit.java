package lv.food;

/**
 * Created by avasiliev on 09.03.18.
 */
public abstract class Fruit {

  public Integer getFruit() {
    return fruit;
  }

  public void setFruit(Integer fruit) {
    this.fruit = fruit;
  }

  private Integer fruit;

  public String getFruitName() {
    return fruitName;
  }

  public void setFruitName(String fruitName) {
    this.fruitName = fruitName;
  }

  private String fruitName;
  public void grow(Integer fruit){
    fruit++;
  }

}
