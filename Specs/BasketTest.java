import static org.junit.Assert.*;
import org.junit.*;

import ShoppingBasket.*;
import java.util.*;

public class BasketTest {

  CompactDisc item1;
  Vinyl item2;
  Vinyl item3;
  Basket basket;

  @Before
  public void before(){
    item1 = new CompactDisc("Bobby Conn", "The Golden Age", "bogof", 9.99);
    item2 = new Vinyl("Miles Davis", "Sketches of Spain", "full", 13.99, "180gm");
    item3 = new Vinyl("Divine Comedy", "Casanova", "bogof", 15.99, "undefined");
    
    basket = new Basket("loyal");
    
    basket.addItemToBasket(item2);
    basket.addItemToBasket(item3);
    basket.addItemToBasket(item1);
  }

  @Test
  public void canGetBasket(){
    assertEquals(3, basket.getBasket().size());
  }

  @Test
  public void canAddItemToBasket(){
    assertEquals(3, basket.countBasketContents());
  }

  @Test
  public void canFindIndexOfItemInBasket(){
    assertEquals(1, basket.getIndexOfItemInBasket(item3));
  }

  @Test
  public void CanRemoveItemFromBasket(){
    basket.removeItemFromBasket(item3);
    assertEquals(2, basket.countBasketContents());
    assertEquals(-1, basket.getIndexOfItemInBasket(item3));
  }

  @Test
  public void canEmptyAllItemsFromTheBasket(){
    basket.removeAllItems();
    assertEquals(0, basket.countBasketContents());
  }

}